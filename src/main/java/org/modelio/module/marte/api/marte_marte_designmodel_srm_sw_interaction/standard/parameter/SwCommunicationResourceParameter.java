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
 * Proxy class to handle a {@link Parameter} with << SwCommunicationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("372392fb-400e-4e0c-a68d-3a710d59d19f")
public class SwCommunicationResourceParameter extends SwInteractionResourceParameter {
    @objid ("d226d506-fcf2-446e-b428-78a4e38c7a8c")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Parameter";

    @objid ("bb8156c5-9e7f-4f62-9dac-8d2613db65f0")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE = "SwCommunicationResource_Parameter_blockT";

    @objid ("c625ca10-7fab-4897-99a7-cbd2a2e1ebe9")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE = "SwCommunicationResource_Parameter_capacity";

    @objid ("fccf61c4-22e3-4078-b656-1b447cb54d5a")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Parameter_elementSize";

    @objid ("495cf478-1ee2-4bbe-bca1-13cbd4a81ac8")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Parameter_mainScheduler";

    @objid ("131caff2-3be4-41a6-b121-56a0fa01de60")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE = "SwCommunicationResource_Parameter_packetT";

    @objid ("e190de7f-ebf6-495e-a325-b9f758329c11")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Parameter_speedFactor";

    @objid ("bb8924c8-e0dc-4e22-8593-beed6481271a")
    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Parameter_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d80b7ea4-a063-4edb-b48c-126f775e189d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwCommunicationResource_Parameter >> then instantiate a {@link SwCommunicationResourceParameter} proxy.
     * 
     * @return a {@link SwCommunicationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("51ecda5a-c892-4675-b7c0-a6d81baaf4c3")
    public static SwCommunicationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceParameter.STEREOTYPE_NAME);
        return SwCommunicationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwCommunicationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("0c856298-1e4e-4900-b1e0-56c56db9e92b")
    public static SwCommunicationResourceParameter instantiate(final Parameter obj) {
        return SwCommunicationResourceParameter.canInstantiate(obj) ? new SwCommunicationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwCommunicationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("86de1f06-6a8a-4ec4-951d-e4e709f847fe")
    public static SwCommunicationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwCommunicationResourceParameter.canInstantiate(obj))
        	return new SwCommunicationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2312aef3-cf72-4b00-b27b-53f6413673e9")
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
        SwCommunicationResourceParameter other = (SwCommunicationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2452c36c-54de-484d-a940-2ad0cb6fb0f4")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ddd6206-4191-4ed0-a9cf-696f0640c326")
    public List<String> getSwCommunicationResource_Parameter_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e18d8609-0c13-400f-8b29-aecc89c60de6")
    public List<String> getSwCommunicationResource_Parameter_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d9147a6-1908-4563-8327-772777f1a1f7")
    public String getSwCommunicationResource_Parameter_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f6158a0-7393-446b-a56a-33f75250f27d")
    public String getSwCommunicationResource_Parameter_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2d93ba1-906a-46c6-8680-1394aa11e226")
    public List<String> getSwCommunicationResource_Parameter_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b47914a-1896-443e-a713-911b690c2030")
    public String getSwCommunicationResource_Parameter_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ba1518b-03ba-4435-bdf4-85a4fd6fd104")
    public String getSwCommunicationResource_Parameter_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("b392b1c6-dd97-4fd6-b896-9f06f932a165")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("916a5635-f265-4785-b22f-885a84ba567a")
    public void setSwCommunicationResource_Parameter_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86840648-2787-429e-be4b-e016f118d100")
    public void setSwCommunicationResource_Parameter_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90f23eda-9c73-43ea-9ead-44bdd5d1faea")
    public void setSwCommunicationResource_Parameter_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df5142e5-79b8-4e88-9967-640813629df4")
    public void setSwCommunicationResource_Parameter_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7f32cb5-232c-4efd-b9d4-8db5f0a36768")
    public void setSwCommunicationResource_Parameter_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dafae974-56c5-4bb2-a215-214708f5c747")
    public void setSwCommunicationResource_Parameter_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2c91b1a-94c3-4f69-9614-b1c7a41c5dc7")
    public void setSwCommunicationResource_Parameter_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("a8c89b3b-9b3c-4d5a-aca6-f33c747e0e7a")
    protected SwCommunicationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("bbd4fa08-f96d-4c0d-aef3-00083addbb73")
    public static final class MdaTypes {
        @objid ("05a083aa-e05b-445a-843b-befc0af83e53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("23f41aa1-74b9-46c6-9c71-f9f28e3a4081")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT;

        @objid ("ae07dfab-430a-4940-8533-94806330c3b7")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT;

        @objid ("bab687f6-0ab0-490b-919c-30bda10d28e5")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("1cc600aa-4ba6-4ada-a6c8-d2ac5d3c3e77")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("efb3c1de-4db1-4bd7-82fd-56e9d67f421c")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("cba24802-5bfb-40dc-8720-fe63cff169f7")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("8275bc19-5726-4723-90ff-e4405db4cf8a")
        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT;

        @objid ("7da2ce9c-e5d6-4c5f-b67f-bd9cd1205254")
        private static Stereotype MDAASSOCDEP;

        @objid ("7656e7fc-d68c-492f-9c96-20dc9731a8b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac669bb8-80e2-472b-813c-42ad8b28f202")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d118-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb7-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb6-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb5-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb4-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb3-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e19a19f6-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3f1b9ea-60ca-11e3-a828-0027103f347d");
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
