/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Attribute} with << SwCommunicationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("25bf6f70-e2fc-4043-92cc-39ea880abbd8")
public class SwCommunicationResourceAttribute extends SwInteractionResourceAttribute {
    @objid ("32dc615c-7b76-4f80-8cd2-5a9111a29a0e")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Attribute";

    @objid ("1c47f4be-dd76-4bd8-8716-a23fc3c3ad4c")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE = "SwCommunicationResource_Attribute_blockT";

    @objid ("4bf0383b-8fa4-4d70-8971-43f39c1763db")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SwCommunicationResource_Attribute_capacity";

    @objid ("6154981d-3cf4-4fa2-ab78-6fa5dd07fbd3")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Attribute_elementSize";

    @objid ("6b099906-79a3-48a3-a2f6-96635c289b73")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Attribute_mainScheduler";

    @objid ("b255494b-a56c-423c-8f43-6f94c4946d68")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE = "SwCommunicationResource_Attribute_packetT";

    @objid ("d1f3655f-4dd7-44ea-a821-55a0ed7751db")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Attribute_speedFactor";

    @objid ("ac649153-d114-4bc4-8864-ebcc9ba22282")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Attribute_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c721b34-2003-44d4-ba8c-43cad1a342c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> then instantiate a {@link SwCommunicationResourceAttribute} proxy.
     * 
     * @return a {@link SwCommunicationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("33c533bb-6f95-4a89-94d4-b950b27c271b")
    public static SwCommunicationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME);
        return SwCommunicationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwCommunicationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("3a6ebc29-62f4-4faa-a369-fb9c6a6ca2f3")
    public static SwCommunicationResourceAttribute instantiate(final Attribute obj) {
        return SwCommunicationResourceAttribute.canInstantiate(obj) ? new SwCommunicationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwCommunicationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5788e770-37e8-4f44-8a26-0bacdb4fb5ea")
    public static SwCommunicationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAttribute.canInstantiate(obj))
        	return new SwCommunicationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("397192d1-adb8-40c9-acc6-fd73df312ac5")
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
        SwCommunicationResourceAttribute other = (SwCommunicationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("21885e81-0c8c-4b16-bd08-4341bb8208ec")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ff0d2e7e-3777-47b0-ae9c-69abc0ddf7d2")
    public List<String> getSwCommunicationResource_Attribute_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c493636-61f7-4260-8d3c-7b22f6ab6a19")
    public List<String> getSwCommunicationResource_Attribute_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fed26a3a-9f64-4199-b348-2469a715e08d")
    public String getSwCommunicationResource_Attribute_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("392f69f4-4a11-4743-bc20-ea29f957207d")
    public String getSwCommunicationResource_Attribute_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4130b0b9-3aef-4d7d-9e7d-c1f1dc148e00")
    public List<String> getSwCommunicationResource_Attribute_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f855bb6-ca31-48ee-bb37-c556e35ec819")
    public String getSwCommunicationResource_Attribute_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c389ac5e-c5c3-444a-87b7-419f21ca76bc")
    public String getSwCommunicationResource_Attribute_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("7ff30264-e454-4d3b-960b-d23e88b62047")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2a37ed7-d5ec-4ee3-8cc3-8f020c756e7b")
    public void setSwCommunicationResource_Attribute_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c706cc2b-ec05-454f-a0c3-6b9ebc74f28b")
    public void setSwCommunicationResource_Attribute_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("392f53df-33df-4d8e-bb82-ab51101460c8")
    public void setSwCommunicationResource_Attribute_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fe9cb99-d816-4d7f-8e25-6d0b8aac64d5")
    public void setSwCommunicationResource_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d167ce1-bf79-4058-8458-b70d73e1e870")
    public void setSwCommunicationResource_Attribute_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("506e6443-ac11-4fd3-b583-f55465ef59dd")
    public void setSwCommunicationResource_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d103c3b-cfec-4c69-8b79-ff3f1a82ff05")
    public void setSwCommunicationResource_Attribute_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("5295554a-06b7-426a-9d5a-ce1fdd37f1f0")
    protected SwCommunicationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("91df1d24-ee27-4493-ac65-61505e61bef0")
    public static final class MdaTypes {
        @objid ("f44fd847-c155-4de7-af56-f9edf68e6ad0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1033ee4-eb1c-4bc4-a166-16d640533c37")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT;

        @objid ("16be714c-389d-4a78-98a5-8f5fff2ec056")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT;

        @objid ("c7c49a26-806e-45a4-b9e6-1b850724c8c2")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("daf96126-add7-4bb7-a906-3f4494358a64")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("95891698-30b0-4344-89c3-62fad4a9dbf2")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("1ab21cb2-fe86-488a-a23e-f27e554c8957")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("d1d8fb3b-5cff-4e97-92f1-8b5a79736247")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("5410845c-236b-4495-bad3-b487c71942fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cd71933-93bc-4fc5-96c8-dee4021b7853")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b1998f2c-5b42-41a2-b6d3-18194cfe11e7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d11b-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca23-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca22-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca21-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca20-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca1f-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a23f493d-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0f77e8a-60ca-11e3-a828-0027103f347d");
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
