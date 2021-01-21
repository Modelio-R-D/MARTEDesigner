/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwArbiterLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwDMA_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("41b6489d-82b2-4318-8ca0-cf7f9e92a8ba")
public class HwDMALink extends HwArbiterLink {
    @objid ("b5dec406-704a-486b-ae9c-febc949843d3")
    public static final String STEREOTYPE_NAME = "HwDMA_Link";

    @objid ("bd70141d-7b02-459c-b75a-792eb65f69ee")
    public static final String HWDMA_LINK_DRIVENBY_TAGTYPE = "HwDMA_Link_drivenBy";

    @objid ("92856238-2acd-443e-85a7-2959145ce452")
    public static final String HWDMA_LINK_ELEMENTSIZE_TAGTYPE = "HwDMA_Link_elementSize";

    @objid ("8ca57cb7-fcac-48fc-8285-df685303df0e")
    public static final String HWDMA_LINK_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Link_managedMemories";

    @objid ("f7f01805-d120-4e78-a35c-6dfbf9804a05")
    public static final String HWDMA_LINK_NBCHANNELS_TAGTYPE = "HwDMA_Link_nbChannels";

    @objid ("12990943-bc57-403b-bf22-06f9672b467d")
    public static final String HWDMA_LINK_TRANSFERWIDTH_TAGTYPE = "HwDMA_Link_transferWidth";

    /**
     * Tells whether a {@link HwDMALink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwDMA_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("95436983-335a-4177-8f05-ac2e672b9089")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwDMA_Link >> then instantiate a {@link HwDMALink} proxy.
     * 
     * @return a {@link HwDMALink} proxy on the created {@link Link}.
     */
    @objid ("9423f8f3-de87-441a-936d-84fe42b601de")
    public static HwDMALink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALink.STEREOTYPE_NAME);
        return HwDMALink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwDMALink} proxy from a {@link Link} stereotyped << HwDMA_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwDMALink} proxy or <i>null</i>.
     */
    @objid ("395d5a8f-6613-4feb-a0c8-fc37f2052fa7")
    public static HwDMALink instantiate(final Link obj) {
        return HwDMALink.canInstantiate(obj) ? new HwDMALink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMALink} proxy from a {@link Link} stereotyped << HwDMA_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwDMALink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("584ceeab-4411-46dd-82b3-57eec0883c03")
    public static HwDMALink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwDMALink.canInstantiate(obj))
        	return new HwDMALink(obj);
        else
        	throw new IllegalArgumentException("HwDMALink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0a5d6a5-aa7c-43bd-9cb8-7521c5538af9")
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
        HwDMALink other = (HwDMALink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("c79ce318-5111-4910-9885-9d726368f289")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Link_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("04d0713e-b7cb-43c8-9479-e848a20a162f")
    public List<String> getHwDMA_Link_drivenBy() {
        return this.elt.getTagValues(HwDMALink.MdaTypes.HWDMA_LINK_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01899b51-01da-4d47-9819-e022183da5b2")
    public String getHwDMA_Link_elementSize() {
        return this.elt.getTagValue(HwDMALink.MdaTypes.HWDMA_LINK_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Link_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("037c0fb1-eb13-418d-9abc-14c9de80ccea")
    public List<String> getHwDMA_Link_managedMemories() {
        return this.elt.getTagValues(HwDMALink.MdaTypes.HWDMA_LINK_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Link_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20fc542f-d384-49b4-a5e8-b56853ca3836")
    public String getHwDMA_Link_nbChannels() {
        return this.elt.getTagValue(HwDMALink.MdaTypes.HWDMA_LINK_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Link_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93b73b2c-df1e-4c14-bdd1-b2293e6647f4")
    public String getHwDMA_Link_transferWidth() {
        return this.elt.getTagValue(HwDMALink.MdaTypes.HWDMA_LINK_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("107ebc53-2d97-49fc-bd24-d7752fd5aa85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Link_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1fe3df3e-a345-4da5-b76b-ef32478e3bc3")
    public void setHwDMA_Link_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMALink.MdaTypes.HWDMA_LINK_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c9cebd7-1859-4bf1-bc9b-4be7ca718130")
    public void setHwDMA_Link_elementSize(final String value) {
        this.elt.putTagValue(HwDMALink.MdaTypes.HWDMA_LINK_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Link_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0678f27-f25a-4799-bb96-2e693b19bebb")
    public void setHwDMA_Link_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMALink.MdaTypes.HWDMA_LINK_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Link_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a44a0cf8-fe7a-4e17-8adf-a4d5ff10de6c")
    public void setHwDMA_Link_nbChannels(final String value) {
        this.elt.putTagValue(HwDMALink.MdaTypes.HWDMA_LINK_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Link_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("457defd2-0497-437e-940c-590adf032ec2")
    public void setHwDMA_Link_transferWidth(final String value) {
        this.elt.putTagValue(HwDMALink.MdaTypes.HWDMA_LINK_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("ec39e40e-9b61-4aea-9ab2-d2bcd5182c5a")
    protected HwDMALink(final Link elt) {
        super(elt);
    }

    @objid ("afd063c5-a7a1-4166-af71-660bfcdef3c6")
    public static final class MdaTypes {
        @objid ("65696ced-418f-4ae5-9e4d-6b7c441dafa7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a8734b3-51d8-4d64-9436-85d802548baf")
        public static TagType HWDMA_LINK_NBCHANNELS_TAGTYPE_ELT;

        @objid ("ffda5fec-8cd3-4e0c-983b-fe9630f13ab5")
        public static TagType HWDMA_LINK_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("6e18c9d0-2783-4be2-9e3f-4dc4fb0c98e7")
        public static TagType HWDMA_LINK_DRIVENBY_TAGTYPE_ELT;

        @objid ("e38cf09d-e7cb-4e54-a1ee-452f96bdf8fe")
        public static TagType HWDMA_LINK_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("0b716cf0-4135-445f-94b1-16d8c5113ed3")
        public static TagType HWDMA_LINK_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("067cdbf7-6325-4cd3-ac8e-8137a51cf55a")
        private static Stereotype MDAASSOCDEP;

        @objid ("a780cb3c-5477-4cb8-96fb-bc85dd5229e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1cae5193-37ca-46cf-981c-03898ed4c627")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01783c9c-0ccf-11df-8525-001302895b2b");
            HWDMA_LINK_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0141-0ccf-11df-8525-001302895b2b");
            HWDMA_LINK_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0148-0ccf-11df-8525-001302895b2b");
            HWDMA_LINK_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d014f-0ccf-11df-8525-001302895b2b");
            HWDMA_LINK_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6baf82e8-162f-11df-b9be-0014222a9f79");
            HWDMA_LINK_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a16608a9-92a3-11e0-a69d-0027103f347c");
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
