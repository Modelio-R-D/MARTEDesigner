/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("9de69250-3e66-47e5-ade9-665296c3ef39")
    public static final String STEREOTYPE_NAME = "TimerResource_Parameter";

    @objid ("25da1229-b06a-4d9a-8509-40e06794b760")
    public static final String TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE = "TimerResource_Parameter_duration";

    @objid ("d0d3fe6c-6730-4f7b-a9db-3891b44bfcf2")
    public static final String TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE = "TimerResource_Parameter_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << TimerResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4d48c12f-49ad-4b8f-bc2b-7652cbcb4cc1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << TimerResource_Parameter >> then instantiate a {@link TimerResourceParameter} proxy.
     * 
     * @return a {@link TimerResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("6df583f2-bab2-4d8d-8c01-027c61e2f989")
    public static TimerResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME);
        return TimerResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceParameter} proxy from a {@link Parameter} stereotyped << TimerResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link TimerResourceParameter} proxy or <i>null</i>.
     */
    @objid ("c2b675cc-1066-43f8-80ae-fee43d7679f3")
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
    @objid ("dbb71708-87f4-46c8-ae77-c9f59311145b")
    public static TimerResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (TimerResourceParameter.canInstantiate(obj))
        	return new TimerResourceParameter(obj);
        else
        	throw new IllegalArgumentException("TimerResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84ed1b36-215f-4419-91a1-b2bbe0aad212")
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
    @objid ("5ae06be9-e4a1-4734-8445-d587e4e50e5d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8eb186d0-ecda-4ac3-bb25-71ff27df9a89")
    public String getTimerResource_Parameter_duration() {
        return this.elt.getTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT);
    }

    @objid ("c1dc5e3a-44f4-4e21-9f7c-2926446f5007")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89a3af9e-3889-46f6-a4e5-1fbb8a7c980e")
    public boolean isTimerResource_Parameter_isPeriodic() {
        return this.elt.isTagged(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f93225f3-a381-4a70-9ce2-89f16b1cef5c")
    public void setTimerResource_Parameter_duration(final String value) {
        this.elt.putTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04763787-2a70-49a1-b759-f2b6af858bd1")
    public void setTimerResource_Parameter_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("47d2d182-e668-432b-bacc-a6c12888dd85")
    protected TimerResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("3ece2f10-abe4-43e4-9869-6190390911c7")
    public static final class MdaTypes {
        @objid ("a4920a64-feae-4ed8-abfa-a4bccb6525c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a5902ee-9eab-40db-9139-94b48d5f75e8")
        public static TagType TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT;

        @objid ("68a9596f-0ad3-4559-8a51-dce6a3e9e9bb")
        public static TagType TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT;

        @objid ("d4fcaedb-068a-4f80-bbb0-2af0a8af5c66")
        private static Stereotype MDAASSOCDEP;

        @objid ("e18536f1-1509-437b-b8bb-54e076e0de57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a48dee4-796a-4318-8f36-15b40701fdc3")
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
