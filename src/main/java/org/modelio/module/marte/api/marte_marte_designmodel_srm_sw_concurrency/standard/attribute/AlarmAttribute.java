/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Attribute} with << Alarm_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2c888d38-650a-4589-9a57-b22db3362791")
public class AlarmAttribute extends InterruptResourceAttribute {
    @objid ("e8afb346-174e-4bd4-a61b-bea782e2bc86")
    public static final String STEREOTYPE_NAME = "Alarm_Attribute";

    @objid ("eaa85bc7-d0b2-4c1e-b52a-551fc262a6e5")
    public static final String ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE = "Alarm_Attribute_isWatchdog";

    @objid ("8e8c3c3a-c834-42b4-86ba-142de1067539")
    public static final String ALARM_ATTRIBUTE_TIMERS_TAGTYPE = "Alarm_Attribute_timers";

    /**
     * Tells whether a {@link AlarmAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Alarm_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6e7c2ee6-b298-45cb-a1bd-0ac82d72e4ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Alarm_Attribute >> then instantiate a {@link AlarmAttribute} proxy.
     * 
     * @return a {@link AlarmAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("47009398-a230-47e9-8e8e-7d8d539bcf02")
    public static AlarmAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAttribute.STEREOTYPE_NAME);
        return AlarmAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAttribute} proxy from a {@link Attribute} stereotyped << Alarm_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link AlarmAttribute} proxy or <i>null</i>.
     */
    @objid ("da5e7d5a-5654-4fa4-bdfb-7afd8724176b")
    public static AlarmAttribute instantiate(final Attribute obj) {
        return AlarmAttribute.canInstantiate(obj) ? new AlarmAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmAttribute} proxy from a {@link Attribute} stereotyped << Alarm_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link AlarmAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1a06432-a657-4347-aa59-6ff17c63825f")
    public static AlarmAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AlarmAttribute.canInstantiate(obj))
        	return new AlarmAttribute(obj);
        else
        	throw new IllegalArgumentException("AlarmAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4455aeee-1a5b-490c-8ce6-f7e22619cb47")
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
        AlarmAttribute other = (AlarmAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Attribute_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("505bd418-868d-41ab-9743-085c01c192f0")
    public List<String> getAlarm_Attribute_timers() {
        return this.elt.getTagValues(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("8e0ac1ea-dc34-4dc7-84c6-efa60c28e05b")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("9e75df41-e480-4db0-8fa1-c0d53bc46398")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Attribute_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("864e5c45-1f1f-4577-8800-9d3f26077077")
    public boolean isAlarm_Attribute_isWatchdog() {
        return this.elt.isTagged(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Attribute_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cc45ae6-3e2c-498f-a797-9c4564deca03")
    public void setAlarm_Attribute_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Attribute_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e255204-317e-4343-8f0c-9bc093d9743a")
    public void setAlarm_Attribute_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("ff58053b-20fb-4750-ad68-4fcacfdcedb4")
    protected AlarmAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("b2ace832-66e2-4463-9817-7d9509372b2a")
    public static final class MdaTypes {
        @objid ("2da1e382-fba5-4e2a-8256-e84165023ee9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25cb52dd-840d-4e7b-97e2-39b25c2fdc26")
        public static TagType ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("057001fb-11f2-4eaa-9c90-469736a8a317")
        public static TagType ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT;

        @objid ("332b896f-033b-4ecf-8d0a-6513df875984")
        private static Stereotype MDAASSOCDEP;

        @objid ("b003df6c-8ad3-406d-beb1-8fb8b0fd564c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e213d537-21e7-4b55-bb77-e6c068121065")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43542-0ccf-11df-8525-001302895b2b");
            ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43549-0ccf-11df-8525-001302895b2b");
            ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43550-0ccf-11df-8525-001302895b2b");
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
