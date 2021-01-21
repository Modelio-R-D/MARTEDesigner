/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwArbiterLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwDMA_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2a42bc69-8b64-417b-b665-fe1ebec289d2")
public class HwDMALifeline extends HwArbiterLifeline {
    @objid ("fa682cc4-e194-4ee4-91eb-89ce20dafefd")
    public static final String STEREOTYPE_NAME = "HwDMA_Lifeline";

    @objid ("e2b401bf-9b64-4d84-a4b8-3cc85e03d8b9")
    public static final String HWDMA_LIFELINE_DRIVENBY_TAGTYPE = "HwDMA_Lifeline_drivenBy";

    @objid ("9d4cf159-61ca-472a-9144-8e401507fb2a")
    public static final String HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE = "HwDMA_Lifeline_elementSize";

    @objid ("1adcd5a1-c90f-4436-b39c-f901aec75893")
    public static final String HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Lifeline_managedMemories";

    @objid ("51219c1e-ad1a-494f-ba7d-456247cdb7d0")
    public static final String HWDMA_LIFELINE_NBCHANNELS_TAGTYPE = "HwDMA_Lifeline_nbChannels";

    @objid ("b6c62348-3199-46b2-b356-05fa17735943")
    public static final String HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Lifeline_transferWidth";

    /**
     * Tells whether a {@link HwDMALifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwDMA_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3377bd3b-fc19-4158-867e-aa59bc0f8a3d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwDMA_Lifeline >> then instantiate a {@link HwDMALifeline} proxy.
     * 
     * @return a {@link HwDMALifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("37e1de0b-74fd-4f9c-80c0-19902cb27138")
    public static HwDMALifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMALifeline.STEREOTYPE_NAME);
        return HwDMALifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwDMALifeline} proxy from a {@link Lifeline} stereotyped << HwDMA_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwDMALifeline} proxy or <i>null</i>.
     */
    @objid ("461e8c4e-b7fe-421d-8bcf-2716a7aa744f")
    public static HwDMALifeline instantiate(final Lifeline obj) {
        return HwDMALifeline.canInstantiate(obj) ? new HwDMALifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMALifeline} proxy from a {@link Lifeline} stereotyped << HwDMA_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwDMALifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8ad9b878-ee32-4812-bfd5-f1f727083569")
    public static HwDMALifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwDMALifeline.canInstantiate(obj))
        	return new HwDMALifeline(obj);
        else
        	throw new IllegalArgumentException("HwDMALifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae905383-bd79-4339-b2dc-6c764073b294")
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
        HwDMALifeline other = (HwDMALifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("137f4ae7-055c-4fd4-97c1-212970394008")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Lifeline_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e0b916e0-fba6-4dd2-a9e2-9894842e4eec")
    public List<String> getHwDMA_Lifeline_drivenBy() {
        return this.elt.getTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21a4a318-2487-475c-97c4-ad34b1f61729")
    public String getHwDMA_Lifeline_elementSize() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Lifeline_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7a92040a-ab7c-49b4-bf8d-38167d9071b6")
    public List<String> getHwDMA_Lifeline_managedMemories() {
        return this.elt.getTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38efb0b7-1eb0-44e1-b00f-dfe20cc5d2a1")
    public String getHwDMA_Lifeline_nbChannels() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Lifeline_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1eb470ef-a021-4202-98f7-cde39f3bcadb")
    public String getHwDMA_Lifeline_transferWidth() {
        return this.elt.getTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("2ca5ce7f-a353-4ade-b723-4995d96fb9b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Lifeline_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6b5b5c5-2a54-4116-bc16-d9e641cdd3aa")
    public void setHwDMA_Lifeline_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19ee2a15-bfe3-4777-b615-34c8fe612d39")
    public void setHwDMA_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Lifeline_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62bde704-59f2-43d5-bda8-f7867b712d9c")
    public void setHwDMA_Lifeline_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45127f69-9d74-49e6-a96e-e11959d7a9d8")
    public void setHwDMA_Lifeline_nbChannels(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Lifeline_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("038c8140-0688-42e4-81db-cf423f5ba75e")
    public void setHwDMA_Lifeline_transferWidth(final String value) {
        this.elt.putTagValue(HwDMALifeline.MdaTypes.HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("9cfc9df4-176a-4f53-a215-5f4df84431b4")
    protected HwDMALifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("7c7394c3-3d83-448f-b6af-69b367de45da")
    public static final class MdaTypes {
        @objid ("e207ebbe-6921-4825-9b3f-08287059202e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46fe230d-1a0b-476e-abd1-21cb214f5706")
        public static TagType HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT;

        @objid ("8a8013ba-c648-4678-883e-cb3e0bab2f15")
        public static TagType HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("73a832af-5894-4c2e-a73f-8cfc599e678a")
        public static TagType HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT;

        @objid ("338c3ff6-701b-4b92-b768-da3ecabaa283")
        public static TagType HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("d62580cb-4758-4f2f-b36f-3fcdb79cecaf")
        public static TagType HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("b6f2bcc0-dfa8-4b3e-85cb-68f325a5f366")
        private static Stereotype MDAASSOCDEP;

        @objid ("19008b10-6cee-42d3-bdaa-255952c33aac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0fbb83db-6f36-4be4-8e4b-851371dc4768")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8acc123a-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123d-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123c-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8acc123b-10b2-11df-81d9-0014222a9f79");
            HWDMA_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6cbcebc0-162f-11df-b9be-0014222a9f79");
            HWDMA_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a078bc66-92a3-11e0-a69d-0027103f347c");
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
