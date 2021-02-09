/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
 * Proxy class to handle a {@link Parameter} with << NotificationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NotificationResourceParameter extends SwSynchronizationResourceParameter {
    public static final String STEREOTYPE_NAME = "NotificationResource_Parameter";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE = "NotificationResource_Parameter_clearServices";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE = "NotificationResource_Parameter_flushServices";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE = "NotificationResource_Parameter_maskElements";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "NotificationResource_Parameter_mechanism";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE = "NotificationResource_Parameter_occurence";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Parameter_occurenceCountElements";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE = "NotificationResource_Parameter_signalServices";

    public static final String NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE = "NotificationResource_Parameter_waitServices";

    /**
     * Tells whether a {@link NotificationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << NotificationResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << NotificationResource_Parameter >> then instantiate a {@link NotificationResourceParameter} proxy.
     * 
     * @return a {@link NotificationResourceParameter} proxy on the created {@link Parameter}.
     */
    public static NotificationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceParameter.STEREOTYPE_NAME);
        return NotificationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceParameter} proxy from a {@link Parameter} stereotyped << NotificationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link NotificationResourceParameter} proxy or <i>null</i>.
     */
    public static NotificationResourceParameter instantiate(final Parameter obj) {
        return NotificationResourceParameter.canInstantiate(obj) ? new NotificationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceParameter} proxy from a {@link Parameter} stereotyped << NotificationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link NotificationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NotificationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (NotificationResourceParameter.canInstantiate(obj))
        	return new NotificationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        NotificationResourceParameter other = (NotificationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_clearServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_flushServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_maskElements() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Parameter_mechanism() {
        return this.elt.getTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Parameter_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNotificationResource_Parameter_occurence() {
        return this.elt.getTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_signalServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNotificationResource_Parameter_waitServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Parameter_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNotificationResource_Parameter_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT, values);
    }

    protected NotificationResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT;

        public static TagType NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "022fcf42-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f63e-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f645-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f653-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588b-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395892-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395899-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023958a0-0ccf-11df-8525-001302895b2b");
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
