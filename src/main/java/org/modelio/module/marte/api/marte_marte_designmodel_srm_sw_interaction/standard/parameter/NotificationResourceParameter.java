/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
@objid ("79e66ab1-53ca-4b82-9c9e-22900b7364a8")
public class NotificationResourceParameter extends SwSynchronizationResourceParameter {
    @objid ("38f72225-bea0-40f2-80df-21aca525ec89")
    public static final String STEREOTYPE_NAME = "NotificationResource_Parameter";

    @objid ("1c952529-be7b-495b-830e-8f43b9789c7e")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE = "NotificationResource_Parameter_clearServices";

    @objid ("9c539d57-73b7-4e0b-b57b-0131c8110efc")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE = "NotificationResource_Parameter_flushServices";

    @objid ("a89f50a8-c473-402d-8377-5d7c32db778f")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE = "NotificationResource_Parameter_maskElements";

    @objid ("a8532fe8-47df-40d8-8bf6-f7ea3b420d10")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "NotificationResource_Parameter_mechanism";

    @objid ("6144d996-cbd1-4193-b4a7-f118a3dfaa07")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE = "NotificationResource_Parameter_occurence";

    @objid ("07603c68-c3b6-4b91-b4c7-03ffec7f219c")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Parameter_occurenceCountElements";

    @objid ("8f5e1335-62a2-471e-8db5-a5735eadcaa9")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE = "NotificationResource_Parameter_signalServices";

    @objid ("4722f092-6e67-43f5-b4e4-7a40ff907632")
    public static final String NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE = "NotificationResource_Parameter_waitServices";

    /**
     * Tells whether a {@link NotificationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << NotificationResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c3456262-8113-4f5a-a2db-8947e0d8d9e1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << NotificationResource_Parameter >> then instantiate a {@link NotificationResourceParameter} proxy.
     * 
     * @return a {@link NotificationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("29d80f0c-a3ba-4962-b273-51d5d543e4a7")
    public static NotificationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceParameter.STEREOTYPE_NAME);
        return NotificationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceParameter} proxy from a {@link Parameter} stereotyped << NotificationResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link NotificationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("a549c023-b35f-4966-9ea4-8b7b330f9fbb")
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
    @objid ("48b54338-ab56-4136-bd2e-3cc71216b6e5")
    public static NotificationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (NotificationResourceParameter.canInstantiate(obj))
        	return new NotificationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4818b0a-70fa-4bfb-a713-f880e331918e")
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
    @objid ("5faf0023-048f-402a-ba87-8f07f554c558")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("13ade0ed-7fd9-4eeb-92b2-1e9240f7e81d")
    public List<String> getNotificationResource_Parameter_clearServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("acf7d98c-84ec-4e1b-9848-15bacc1ebf7e")
    public List<String> getNotificationResource_Parameter_flushServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8535dbbf-2a98-4cb0-aa54-ec4bc3b5f266")
    public List<String> getNotificationResource_Parameter_maskElements() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6105c409-4ce2-4001-901b-9461daf21fe3")
    public String getNotificationResource_Parameter_mechanism() {
        return this.elt.getTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Parameter_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90127965-fed0-42d9-b040-6fb002452afd")
    public String getNotificationResource_Parameter_occurence() {
        return this.elt.getTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b74dcf10-80a1-4faa-a8eb-f9de4d80a088")
    public List<String> getNotificationResource_Parameter_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1941ec74-88b7-404a-ab2e-2bd23c6a044d")
    public List<String> getNotificationResource_Parameter_signalServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Parameter_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5e7642f5-4d07-46fd-ab5d-897ef0ff0928")
    public List<String> getNotificationResource_Parameter_waitServices() {
        return this.elt.getTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("0588080f-4d56-45dc-8eca-613244a47906")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72d8754f-d844-4e4c-ba9b-8e984d8a1a20")
    public void setNotificationResource_Parameter_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83453b15-d46c-4f2f-b40b-b218c28c3a21")
    public void setNotificationResource_Parameter_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("953014ec-1663-4e32-99f2-53cb7e6ba845")
    public void setNotificationResource_Parameter_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d5c7f55-1377-4b7d-a8d6-cbea41999ec1")
    public void setNotificationResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Parameter_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef1d874d-2ab7-442c-b2ca-b5905037121c")
    public void setNotificationResource_Parameter_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b1b0aec-a68b-4d77-886f-84985a41cba4")
    public void setNotificationResource_Parameter_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5720ca6-fc78-46fd-b297-4e3bdfa0c556")
    public void setNotificationResource_Parameter_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Parameter_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f66ae0f9-1eb4-415b-98d3-914b0634ab85")
    public void setNotificationResource_Parameter_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceParameter.MdaTypes.NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("f837b782-78ae-4ecc-85a0-d209ed36eb9c")
    protected NotificationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("114a750a-7f41-4338-87a6-f76870fe61a5")
    public static final class MdaTypes {
        @objid ("6c4e71e9-0d13-4819-be42-1b38fb1773fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0513d1cd-774c-4833-8a87-e7cf3ef3285e")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_OCCURENCE_TAGTYPE_ELT;

        @objid ("3b52005f-a9be-4fbb-a942-e477bca1499e")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        @objid ("06006500-13fb-46cb-b9d0-2269dab1e85e")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("193d2722-cfaf-4cb2-bd48-aacf658feab9")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("3128a3a0-1aa7-4841-b789-9e4bd6abde5b")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("b8c61e12-9583-4c5f-8185-92151f2ab28e")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("10ca333e-ffb4-479c-bf62-89c6f037dc77")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_WAITSERVICES_TAGTYPE_ELT;

        @objid ("259a0d65-b382-4f65-9f3e-e9542b52ef0e")
        public static TagType NOTIFICATIONRESOURCE_PARAMETER_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("da91755d-d454-4bc6-91af-ad1d6e2e633d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef162ff5-4fa5-4311-918e-542b51a48749")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed20dce3-f67b-4293-a642-38ef6b1a8cc5")
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
