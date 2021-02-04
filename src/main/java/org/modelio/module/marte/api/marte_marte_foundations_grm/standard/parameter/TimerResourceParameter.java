/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << TimerResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d1037ec8-3cd0-452e-b12b-aef05c9862b1")
public class TimerResourceParameter extends TimingResourceParameter {
    @objid ("b9a8568d-4e81-47c4-a10f-53526d651ea1")
    public static final String STEREOTYPE_NAME = "TimerResource_Parameter";

    @objid ("b4ae9045-89ab-491c-bfa5-2922d9f4356d")
    public static final String TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE = "TimerResource_Parameter_duration";

    @objid ("e55c03b1-d043-4d3b-acdd-0c2881cecf4f")
    public static final String TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE = "TimerResource_Parameter_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << TimerResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8cea3ae-b410-4c05-98fe-46dac864d67c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << TimerResource_Parameter >> then instantiate a {@link TimerResourceParameter} proxy.
     * 
     * @return a {@link TimerResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("0c1187d5-fad6-4f30-9bdf-232ac0e1355f")
    public static TimerResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME);
        return TimerResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceParameter} proxy from a {@link Parameter} stereotyped << TimerResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link TimerResourceParameter} proxy or <i>null</i>.
     */
    @objid ("7771a8a7-a4ab-4348-bd52-dee86a652529")
    public static TimerResourceParameter instantiate(final Parameter obj) {
        return TimerResourceParameter.canInstantiate(obj) ? new TimerResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceParameter} proxy from a {@link Parameter} stereotyped << TimerResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link TimerResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("494a3f8b-0896-4d96-ab55-8e11bc143d81")
    public static TimerResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (TimerResourceParameter.canInstantiate(obj))
        	return new TimerResourceParameter(obj);
        else
        	throw new IllegalArgumentException("TimerResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f2971990-5422-4ac1-a85f-230ec4247573")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TimerResourceParameter other = (TimerResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("15b494e4-49ad-4c67-bd63-04d3ece956d0")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c7eb765-b7ec-4c1d-aee0-b457635d1675")
    public String getTimerResource_Parameter_duration() {
        return this.elt.getTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT);
    }

    @objid ("4425777d-fb76-40df-8719-a4b0f935986a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("689ffe25-ab57-4c93-8a44-ebf79cb90ad7")
    public boolean isTimerResource_Parameter_isPeriodic() {
        return this.elt.isTagged(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb2829d9-8998-45e6-aebe-c70414c84ed3")
    public void setTimerResource_Parameter_duration(final String value) {
        this.elt.putTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4324e0fa-a924-4234-84bd-9b0268426348")
    public void setTimerResource_Parameter_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("6c4744e3-5978-4946-939d-f37b9a2b7b56")
    protected TimerResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("3ece2f10-abe4-43e4-9869-6190390911c7")
    public static final class MdaTypes {
        @objid ("be7ed770-9d7f-49f5-ab7d-86885b40df23")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1bb942f7-11b5-4861-8a98-b174a9166ad2")
        public static TagType TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT;

        @objid ("599fdcc2-8c80-4804-9565-02e35aa0ff5d")
        public static TagType TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT;

        @objid ("b37cd5fb-a5f7-4e6d-b310-4880fa2c8e18")
        private static Stereotype MDAASSOCDEP;

        @objid ("656ef0e1-151c-4888-9cb3-3d33f729698b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7d409dbe-d859-4bda-8819-35b9133e3fbf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abca-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd1-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd8-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
