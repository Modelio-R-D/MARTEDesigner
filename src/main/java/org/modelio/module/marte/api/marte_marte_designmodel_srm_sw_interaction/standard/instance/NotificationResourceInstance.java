/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << NotificationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("090632a7-ca1b-4d2a-a54c-c2adce0de125")
public class NotificationResourceInstance extends SwSynchronizationResourceInstance {
    @objid ("7d6de2be-f216-4c66-b7d6-6a51fd839db1")
    public static final String STEREOTYPE_NAME = "NotificationResource_Instance";

    @objid ("dff2b744-9d32-429c-b8b1-4a5719c8adbe")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE = "NotificationResource_Instance_clearServices";

    @objid ("38ae8e17-9bec-4bba-9db5-6991a47a64b5")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Instance_flushServices";

    @objid ("1d9ce22e-1feb-4ddd-be74-a1ad3c7845a8")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE = "NotificationResource_Instance_maskElements";

    @objid ("11d22a2b-ec82-4a80-9d6d-c036fe00b5f8")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE = "NotificationResource_Instance_mechanism";

    @objid ("b928b09a-9b6a-4c07-ab54-d7c8381a338a")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE = "NotificationResource_Instance_occurence";

    @objid ("eb10051c-5ece-41ab-9cbb-9380d89b9a69")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Instance_occurenceCountElements";

    @objid ("7d9c67ee-6c08-41a6-9207-8c964ffcb893")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Instance_signalServices";

    @objid ("1d227004-6652-4ecf-9083-49ee34e6914b")
    public static final String NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE = "NotificationResource_Instance_waitServices";

    /**
     * Tells whether a {@link NotificationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NotificationResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7666d673-3482-43b7-a18b-5e2812796184")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NotificationResource_Instance >> then instantiate a {@link NotificationResourceInstance} proxy.
     * 
     * @return a {@link NotificationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("3d269a8d-6f07-465f-a3b1-ba4c7f8603cc")
    public static NotificationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceInstance.STEREOTYPE_NAME);
        return NotificationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceInstance} proxy from a {@link Instance} stereotyped << NotificationResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link NotificationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("e726ad04-6a62-4946-82e5-be2555d7d2b4")
    public static NotificationResourceInstance instantiate(final Instance obj) {
        return NotificationResourceInstance.canInstantiate(obj) ? new NotificationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceInstance} proxy from a {@link Instance} stereotyped << NotificationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link NotificationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("87dfea92-4846-4797-9c5e-7c545d17fccc")
    public static NotificationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NotificationResourceInstance.canInstantiate(obj))
        	return new NotificationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b58edb81-7c9b-4da3-b9e0-9cc4391381c8")
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
        NotificationResourceInstance other = (NotificationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("300f666b-376d-4608-a775-08418ef003ee")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9be881d1-d17d-45e9-88dc-95821d3a06d6")
    public List<String> getNotificationResource_Instance_clearServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d91287a2-4aca-4495-856f-c5d74a78efaa")
    public List<String> getNotificationResource_Instance_flushServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("db5cbd09-4eca-41a0-b8dd-ec4c6efff2d1")
    public List<String> getNotificationResource_Instance_maskElements() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4754c21e-f22c-4caa-aaad-3025af5b5fe7")
    public String getNotificationResource_Instance_mechanism() {
        return this.elt.getTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Instance_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea233476-3afd-47c4-acf9-1f19eeaa4a80")
    public String getNotificationResource_Instance_occurence() {
        return this.elt.getTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b03212e-119d-4e9a-9541-da87631bce63")
    public List<String> getNotificationResource_Instance_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4d25b663-7fec-4070-a379-0b965b4b3143")
    public List<String> getNotificationResource_Instance_signalServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Instance_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f918ff3-8a2f-41e8-8a9d-e1bff1f9c3eb")
    public List<String> getNotificationResource_Instance_waitServices() {
        return this.elt.getTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("1b524fd9-eb6f-4ee5-b594-059c2dc1758f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b19555c-5664-45dc-abc4-97166a1a4fae")
    public void setNotificationResource_Instance_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("237bb393-1f68-4a3f-abb4-9ffb351ec856")
    public void setNotificationResource_Instance_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("507cb59c-fcb5-4b15-b367-88ec6f373e5d")
    public void setNotificationResource_Instance_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5221ea38-fc46-4c35-8170-77173e3d3f5c")
    public void setNotificationResource_Instance_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Instance_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0f7e023-894a-4d2f-bff6-c916056f963e")
    public void setNotificationResource_Instance_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27d2c08e-e7b3-430e-aee3-e0a5aa66e317")
    public void setNotificationResource_Instance_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28343ae0-b985-42de-9e23-05de5dd09674")
    public void setNotificationResource_Instance_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Instance_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7dafe94-e606-4992-b928-f18bed725781")
    public void setNotificationResource_Instance_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceInstance.MdaTypes.NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c9a962c1-78fc-485d-8426-b5657b3894fa")
    protected NotificationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e8f08622-4419-4420-bf7d-cf5c7d94cbba")
    public static final class MdaTypes {
        @objid ("7f94fe26-6b87-41ee-aa57-6914ac14e7b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eadbb929-3eb0-4800-9660-3c07108166be")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT;

        @objid ("d8463a41-fe0e-4267-b60f-de27cfe78e4a")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT;

        @objid ("0dbd2f07-d8a4-452d-a475-7c82d9a04de0")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("408669a0-da3d-4648-a441-3c9769fd98c7")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("d9220c9d-f09f-4539-83b1-9e16303da859")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("cb1a29ef-69cd-44e3-bb2a-e8ac2bc60229")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("6e089d2a-ba97-4481-a93f-89de9729e356")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT;

        @objid ("8456542d-9723-419b-8563-7d2184eb11e2")
        public static TagType NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("c1e50b37-ad2f-42c4-9c5d-d6a57dfef23b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7df1158a-302e-44b1-8568-baedd26ca277")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fe9cc4ba-c6bb-489e-a612-c483e1b63f74")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f63d-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f644-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64b-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f652-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395891-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395898-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023bbade-0ccf-11df-8525-001302895b2b");
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
