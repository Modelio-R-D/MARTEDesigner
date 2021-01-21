/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << NotificationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5601dbd1-de29-48ee-841e-a255966b0e63")
public class NotificationResourceLifeline extends SwSynchronizationResourceLifeline {
    @objid ("17d702fb-886b-4403-8c80-56dd3872586d")
    public static final String STEREOTYPE_NAME = "NotificationResource_Lifeline";

    @objid ("2b9ec55b-adad-4f93-99c8-a07f95596a52")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE = "NotificationResource_Lifeline_clearServices";

    @objid ("587bcaa9-9ff3-47ac-92a7-b000546e2efa")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Lifeline_flushServices";

    @objid ("63d0e8d0-0b67-4fae-966d-caa773e220d9")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE = "NotificationResource_Lifeline_maskElements";

    @objid ("61be8d05-f71f-4c20-9f23-6b0a183fa3c9")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "NotificationResource_Lifeline_mechanism";

    @objid ("4dd61d29-3bd8-49af-8f8c-824be3bc747d")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE = "NotificationResource_Lifeline_occurence";

    @objid ("5c8fbd9f-022d-4d45-a3ae-9f5ad15926c1")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Lifeline_occurenceCountElements";

    @objid ("74e85615-fa93-4f22-b1b8-97e74c203507")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Lifeline_signalServices";

    @objid ("586b907c-b6a8-47bc-b642-ff82e752473f")
    public static final String NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE = "NotificationResource_Lifeline_waitServices";

    /**
     * Tells whether a {@link NotificationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << NotificationResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b48fbf38-ced3-4981-9ab4-a7c6bf779790")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << NotificationResource_Lifeline >> then instantiate a {@link NotificationResourceLifeline} proxy.
     * 
     * @return a {@link NotificationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("576ea01b-b13e-49b1-91c1-fce0d9b13aab")
    public static NotificationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceLifeline.STEREOTYPE_NAME);
        return NotificationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLifeline} proxy from a {@link Lifeline} stereotyped << NotificationResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link NotificationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("c1ecf832-a3a3-4257-b661-cf5caf3a733d")
    public static NotificationResourceLifeline instantiate(final Lifeline obj) {
        return NotificationResourceLifeline.canInstantiate(obj) ? new NotificationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceLifeline} proxy from a {@link Lifeline} stereotyped << NotificationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link NotificationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a1487960-7541-4d9f-a751-46b697fd8722")
    public static NotificationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (NotificationResourceLifeline.canInstantiate(obj))
        	return new NotificationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f01df768-63b3-4d2f-bf04-dd8d18bc76d6")
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
        NotificationResourceLifeline other = (NotificationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("d6517a18-1bd7-43fc-85be-2c3d67cff5b9")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b011659e-7f3a-40cd-8570-9d1229927300")
    public List<String> getNotificationResource_Lifeline_clearServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a0ad0b09-9df6-47e2-80e7-7f14635a5742")
    public List<String> getNotificationResource_Lifeline_flushServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9fedff53-4852-423b-abe5-e4af0d83f405")
    public List<String> getNotificationResource_Lifeline_maskElements() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05a71c70-b842-4b82-b58e-fca148f1918c")
    public String getNotificationResource_Lifeline_mechanism() {
        return this.elt.getTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Lifeline_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("312f8afd-0ac5-4df1-8320-8dc7bc77687f")
    public String getNotificationResource_Lifeline_occurence() {
        return this.elt.getTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("82bedbe7-6447-480d-b273-dc1f269f28ed")
    public List<String> getNotificationResource_Lifeline_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("97f0c6f8-1592-4820-b6b8-8914e5a10b2a")
    public List<String> getNotificationResource_Lifeline_signalServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Lifeline_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f7e1e45f-6fef-4b38-9fdb-722bde655b37")
    public List<String> getNotificationResource_Lifeline_waitServices() {
        return this.elt.getTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("034d5b9c-0856-490b-92a5-9fedce2a0028")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("038858b3-ab68-4663-8a70-02f0f69c8cc0")
    public void setNotificationResource_Lifeline_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("065ed162-52b2-453d-87ff-fd57372b6318")
    public void setNotificationResource_Lifeline_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd6b984f-53ee-4846-b4f6-0ef564d8acc3")
    public void setNotificationResource_Lifeline_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46f8ecf6-0f91-458f-8594-7b4c84decbe2")
    public void setNotificationResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Lifeline_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42beed77-f015-4713-a4f7-0d4a3c0b5f5e")
    public void setNotificationResource_Lifeline_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3efc0c2-bdda-4899-8a50-dc3a6d926026")
    public void setNotificationResource_Lifeline_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8ebb125-66f7-4240-962c-f57b04ee2472")
    public void setNotificationResource_Lifeline_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Lifeline_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91a487e0-9d16-42e8-a6b7-5398d167964e")
    public void setNotificationResource_Lifeline_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceLifeline.MdaTypes.NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("dc69e00b-bae2-46cd-97f6-7927bdbbd2b8")
    protected NotificationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("a8b81032-62d1-42d7-910a-cfa704f3a4c2")
    public static final class MdaTypes {
        @objid ("d1e42070-5993-49f8-9fd7-9419d2e8e341")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83645ead-7702-4030-a6b9-9692c4030460")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT;

        @objid ("5790ded2-f0cd-409d-ac03-fe47926900e9")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        @objid ("4d5334c0-9b45-4c87-acde-47e4e77db8ef")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("75d36efa-0d70-495e-84b7-869a98154e8c")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("1ea2587a-750c-4c4d-a1c1-e18c4e07d2cb")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("3f98b75e-ea4d-489a-8d19-b6b6845e3b3a")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("e1c7c8b0-033b-4c1a-aa30-566d79532bc1")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT;

        @objid ("70f0e40c-80c5-4f70-8fd9-4bcac5a6f44b")
        public static TagType NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("3f73c920-7733-4023-8551-fb5ec3e4f77a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e089b9b5-8f3e-4e1e-991d-2c554af598bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68380711-9f41-46fb-af92-7dbabd3b31b2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2b23959-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395e-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395f-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b23960-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b23961-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395a-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395b-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395c-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_LIFELINE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2395d-10d8-11df-81d9-0014222a9f79");
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
