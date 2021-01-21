/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << TimerResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e0b5aa1f-11db-4140-bd06-09059c68c47e")
public class TimerResourceAttribute extends TimingResourceAttribute {
    @objid ("4351a8f1-3a84-4ec2-af3d-feaa529b2a5e")
    public static final String STEREOTYPE_NAME = "TimerResource_Attribute";

    @objid ("ce983baf-3c83-4ee2-9fec-a3c781763353")
    public static final String TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE = "TimerResource_Attribute_duration";

    @objid ("e489066c-5082-47c1-826b-36846bd5c1d7")
    public static final String TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE = "TimerResource_Attribute_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TimerResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4b1f8820-b80a-474a-ba12-e97c31ca3dee")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TimerResource_Attribute >> then instantiate a {@link TimerResourceAttribute} proxy.
     * 
     * @return a {@link TimerResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("48e86e99-7ab9-4f7f-805d-99c54087d2d3")
    public static TimerResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAttribute.STEREOTYPE_NAME);
        return TimerResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAttribute} proxy from a {@link Attribute} stereotyped << TimerResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TimerResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("11b2a1b5-eae1-4572-98dd-0e31ec60f9ab")
    public static TimerResourceAttribute instantiate(final Attribute obj) {
        return TimerResourceAttribute.canInstantiate(obj) ? new TimerResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAttribute} proxy from a {@link Attribute} stereotyped << TimerResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TimerResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d5197f1b-e36a-49a9-979b-435f31cbd71a")
    public static TimerResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TimerResourceAttribute.canInstantiate(obj))
        	return new TimerResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa7542fe-e271-4304-b237-dce608bb5ed1")
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
        TimerResourceAttribute other = (TimerResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b0c0fb6a-14a1-4e9b-a8fb-135f4710ba52")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Attribute_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b7a1537-2531-4534-89e0-3218c43db143")
    public String getTimerResource_Attribute_duration() {
        return this.elt.getTagValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT);
    }

    @objid ("7143f792-3c89-4ff1-9286-151cbe6e329e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Attribute_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e7e6520-5bb2-4616-9041-463a29a49776")
    public boolean isTimerResource_Attribute_isPeriodic() {
        return this.elt.isTagged(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Attribute_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("721a6d06-a0c1-4707-b014-b12029f698ee")
    public void setTimerResource_Attribute_duration(final String value) {
        this.elt.putTagValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Attribute_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87c8f2a5-714c-4bf8-bb97-f57215578bf3")
    public void setTimerResource_Attribute_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAttribute.MdaTypes.TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("8148cc70-2107-46a0-9e1b-a852919d2c64")
    protected TimerResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("600702e0-f957-4f26-a194-3069f4b0fbc1")
    public static final class MdaTypes {
        @objid ("a73a41da-df6c-48a3-bcda-6924d853fa87")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7778f0e3-46e5-497a-97b9-9657c9f04e8c")
        public static TagType TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT;

        @objid ("9d2a7676-e4be-45bf-8a75-283bc53bb828")
        public static TagType TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT;

        @objid ("f78ff605-8f64-49f7-9211-664490ed76fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("fec01350-cbcf-47fb-beea-f854ae45d236")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4af4bec4-9263-417c-a983-8697cdc29b93")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc6-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ATTRIBUTE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcd-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ATTRIBUTE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd4-0ccf-11df-8525-001302895b2b");
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
