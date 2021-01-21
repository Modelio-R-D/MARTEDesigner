/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << NotificationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("be780624-df3c-4d1c-8b0c-7d0a2d098df5")
public class NotificationResourceAttribute extends SwSynchronizationResourceAttribute {
    @objid ("5cdc3110-441f-4072-9e11-f25099073c70")
    public static final String STEREOTYPE_NAME = "NotificationResource_Attribute";

    @objid ("ec10669c-b8d3-43c6-be67-8f14d729dd5e")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE = "NotificationResource_Attribute_clearServices";

    @objid ("8a494b1e-315e-4f4f-b952-8afae7f1e3cc")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE = "NotificationResource_Attribute_flushServices";

    @objid ("d87fa7bf-06b1-4f16-af78-f7cd44c9743b")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE = "NotificationResource_Attribute_maskElements";

    @objid ("24c2d745-2783-446c-abc0-45cbad66500e")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "NotificationResource_Attribute_mechanism";

    @objid ("484e3fd9-9f6e-4d50-b223-1daa9f4cd114")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE = "NotificationResource_Attribute_occurence";

    @objid ("2c4e2b7f-3ee7-4f07-9cf3-4d4ec1391741")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Attribute_occurenceCountElements";

    @objid ("e162dead-88f0-4054-9fcf-d51b0bc3201f")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE = "NotificationResource_Attribute_signalServices";

    @objid ("a2247c16-3a0d-4c8a-a5a0-db9ec21adcb8")
    public static final String NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE = "NotificationResource_Attribute_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << NotificationResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e5bcdb52-bb29-4b6d-99d4-6a878b9aca91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << NotificationResource_Attribute >> then instantiate a {@link NotificationResourceAttribute} proxy.
     * 
     * @return a {@link NotificationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("49967b2b-3d45-4ec8-90d4-662a5bd24a18")
    public static NotificationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAttribute.STEREOTYPE_NAME);
        return NotificationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAttribute} proxy from a {@link Attribute} stereotyped << NotificationResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link NotificationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("fddbfe35-e2b5-4358-ba39-a0694a7b858e")
    public static NotificationResourceAttribute instantiate(final Attribute obj) {
        return NotificationResourceAttribute.canInstantiate(obj) ? new NotificationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAttribute} proxy from a {@link Attribute} stereotyped << NotificationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link NotificationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d1dc668b-7fe7-4cf5-8a79-261a0afbb13f")
    public static NotificationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (NotificationResourceAttribute.canInstantiate(obj))
        	return new NotificationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4c7e0f12-15ce-4bd3-8854-df9dffe6176f")
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
        NotificationResourceAttribute other = (NotificationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("6010abdd-e54c-46e0-8a34-b54d977b2c02")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("df6f4ee4-2915-40f4-bb25-065294a6126b")
    public List<String> getNotificationResource_Attribute_clearServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e9a203da-09d0-4201-8973-663695efddac")
    public List<String> getNotificationResource_Attribute_flushServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("32f5ca13-1beb-48c3-912a-1449d6e73444")
    public List<String> getNotificationResource_Attribute_maskElements() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47b42dff-9e5b-44a1-aec4-2f6aba66a61d")
    public String getNotificationResource_Attribute_mechanism() {
        return this.elt.getTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Attribute_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("982472cf-c108-4f7a-9ee3-101f01cd1ae2")
    public String getNotificationResource_Attribute_occurence() {
        return this.elt.getTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f368799-bc44-428c-a8dd-ffc06ad6b626")
    public List<String> getNotificationResource_Attribute_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ddf98cd6-a82d-4809-9c43-7f4662f900e7")
    public List<String> getNotificationResource_Attribute_signalServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Attribute_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0a0baf4c-d04d-4c9a-8367-20d18c6263f3")
    public List<String> getNotificationResource_Attribute_waitServices() {
        return this.elt.getTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("a34e2a40-872f-48a1-a683-4105fc400200")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f70e662d-d47b-43c9-95af-9814707627f8")
    public void setNotificationResource_Attribute_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1bc45f7-7cf5-42f3-8b8e-d256c690737a")
    public void setNotificationResource_Attribute_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1327a05e-9b16-43aa-ba36-a1e8a504f8b0")
    public void setNotificationResource_Attribute_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2a3e536-3287-4dc2-adcb-99f03cb27348")
    public void setNotificationResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Attribute_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a87b7a2f-7841-4bb8-b498-c8de285a432d")
    public void setNotificationResource_Attribute_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72267c28-d21b-4c6e-8b04-2808eb31426a")
    public void setNotificationResource_Attribute_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bdbe765-fe8f-4da4-8926-24fca22666f5")
    public void setNotificationResource_Attribute_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Attribute_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b00cf0f2-dbf3-4d10-85e6-54ea5f062b01")
    public void setNotificationResource_Attribute_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAttribute.MdaTypes.NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("0820b7a0-37c5-4729-aaae-de7544dd300f")
    protected NotificationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("2ba4f044-0756-45c0-b48c-018768993536")
    public static final class MdaTypes {
        @objid ("ba6a4c28-9ce9-4773-99f7-f048713a76fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("edc5400d-792b-44f6-b853-5c17e7f13ac1")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT;

        @objid ("5b76fe59-1a5e-4d5f-9990-18bf6a142722")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        @objid ("17cc7a06-efe6-4b48-af9a-eef2679b3595")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("28212bf8-47b0-4f65-845f-1405a0591ae8")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("2c9a35fc-9919-473c-b6a8-63fd215c6f56")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("a175a10f-45a5-43f7-bee7-4ed046ce56d4")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("65924cae-7d90-48e6-b9a1-34f50b8ee0d8")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT;

        @objid ("b973cbd6-8ada-4337-a475-11b1e40b8e08")
        public static TagType NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("b16bce0f-2341-4760-b742-f1d8de4d3a73")
        private static Stereotype MDAASSOCDEP;

        @objid ("dab2a572-bf66-41be-9710-e807b495d98f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c83bd316-76a7-4bc8-943c-d611a7e1807e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0236f63a-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f641-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f648-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f64f-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0236f656-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239588e-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02395895-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0239589c-0ccf-11df-8525-001302895b2b");
            NOTIFICATIONRESOURCE_ATTRIBUTE_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "023958a3-0ccf-11df-8525-001302895b2b");
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
