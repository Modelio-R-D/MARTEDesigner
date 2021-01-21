/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << NotificationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d7dbdac-5751-4f53-8af1-50e7da8a5299")
public class NotificationResourceAssociationEnd extends SwSynchronizationResourceAssociationEnd {
    @objid ("7899fe01-f37b-4555-bf6a-8be453c8c961")
    public static final String STEREOTYPE_NAME = "NotificationResource_AssociationEnd";

    @objid ("887076ed-2ae7-4fd7-b1cb-01f57ec9f320")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_clearServices";

    @objid ("eb95adde-9cc6-4c0d-81d2-4e9f7da4a0e4")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_flushServices";

    @objid ("4edb14a1-55d8-4d61-a8e7-955a85bf8e21")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE = "NotificationResource_AssociationEnd_maskElements";

    @objid ("791c9772-8c63-4030-80dc-81a59b4db1bf")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "NotificationResource_AssociationEnd_mechanism";

    @objid ("36df20ef-0808-4220-858f-543ca2ca4cbe")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE = "NotificationResource_AssociationEnd_occurence";

    @objid ("ac797803-3f14-4963-a216-15f909948734")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_AssociationEnd_occurenceCountElements";

    @objid ("ddf039c3-e3d4-4ca5-92dc-5af097d46d28")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_signalServices";

    @objid ("96453bbc-0582-4030-b6e5-f9d81be83381")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE = "NotificationResource_AssociationEnd_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("35766322-1ad8-46df-aaff-fd1bda71489e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >> then instantiate a {@link NotificationResourceAssociationEnd} proxy.
     * 
     * @return a {@link NotificationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("5e5b2a7d-0a23-4b71-a633-8898013d1b43")
    public static NotificationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociationEnd.STEREOTYPE_NAME);
        return NotificationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link NotificationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("f8a9a03a-75be-49a5-a122-2b58814fd4f9")
    public static NotificationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return NotificationResourceAssociationEnd.canInstantiate(obj) ? new NotificationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << NotificationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link NotificationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3f210c25-a3bf-480e-bf9a-d8653444788f")
    public static NotificationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (NotificationResourceAssociationEnd.canInstantiate(obj))
        	return new NotificationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0adb9c08-9fc9-417d-9e0a-bebcc32d82e7")
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
        NotificationResourceAssociationEnd other = (NotificationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("fd27d4eb-cfd6-4ac2-b901-b3d618631d77")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9fc649b8-0fab-4ee8-b84d-6c73793aa735")
    public List<String> getNotificationResource_AssociationEnd_clearServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("819c9d97-311f-40e6-8306-42f49810c0a3")
    public List<String> getNotificationResource_AssociationEnd_flushServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("052e8a95-88ba-4729-92dc-11886c7ba96e")
    public List<String> getNotificationResource_AssociationEnd_maskElements() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d4f17e1-43f4-48bb-954d-32f3acc35473")
    public String getNotificationResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_AssociationEnd_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f280aaeb-c409-4579-b981-b1283f1ef09d")
    public String getNotificationResource_AssociationEnd_occurence() {
        return this.elt.getTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e811ee39-eb9c-4907-a821-8f58513b57ef")
    public List<String> getNotificationResource_AssociationEnd_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("41e63412-04f9-4c2c-b31e-413c47f9bee7")
    public List<String> getNotificationResource_AssociationEnd_signalServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_AssociationEnd_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("318c5da2-0e24-4cc9-8c53-e1a4982c948f")
    public List<String> getNotificationResource_AssociationEnd_waitServices() {
        return this.elt.getTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("669825c7-ea0f-47b3-b6ce-a1ba4d9e6ab9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af1ed47b-e51a-4b3c-9546-ee4d1069f02b")
    public void setNotificationResource_AssociationEnd_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5bec0d6-e3fc-4e33-b3a9-31bdf4360e78")
    public void setNotificationResource_AssociationEnd_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a111695a-8672-4b63-b3a3-e478f54be974")
    public void setNotificationResource_AssociationEnd_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9b8bdac-a061-456f-a633-54c9329d9cd7")
    public void setNotificationResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_AssociationEnd_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30a02f92-55f6-4dbd-a92b-619d6dbd81bf")
    public void setNotificationResource_AssociationEnd_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62b1fed1-9f04-4b67-b725-c221adaa95b7")
    public void setNotificationResource_AssociationEnd_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("deb7245d-1cf2-46cd-a0ff-92def0f71d04")
    public void setNotificationResource_AssociationEnd_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_AssociationEnd_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04f01511-6c46-4596-a7b1-5c3f7684027d")
    public void setNotificationResource_AssociationEnd_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociationEnd.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("2b7d07d1-8024-4214-ad56-d6b65f829a5b")
    protected NotificationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("b81a0c87-779a-4b0c-bbf8-d7a27d728831")
    public static final class MdaTypes {
        @objid ("43180e4e-649b-4a25-8b01-125003bda050")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2bb74c8b-b8ee-44e9-9402-ceaf1d20745c")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT;

        @objid ("c89dd4a5-c845-4813-9876-0e9c7d9c9b21")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        @objid ("5dd7c784-f11e-4d4a-9cf8-821d7dd9ff34")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("5cd24648-ebe4-4ba3-b42b-7d579fbddb15")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("3dffabbd-dd03-46cc-9515-5ed681b9bb76")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("56f11ce9-b673-46d4-81c1-62b37ce7ceda")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("cb393eed-e9c8-4c62-8627-9715b0c7fd69")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT;

        @objid ("f85ed6ee-ae9a-4128-8da3-c6efbc524873")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("dc4fddcc-8e95-497f-9ed7-cf36fed6b74a")
        private static Stereotype MDAASSOCDEP;

        @objid ("b7222187-95cd-4dd4-a723-10002518a679")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b26dba4-5aeb-4f6c-af81-979f45330c44")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f638-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f63f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f646-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64d-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f654-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395893-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ASSOCIATIONEND_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023958a1-0ccf-11df-8525-001302895b2b");
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
