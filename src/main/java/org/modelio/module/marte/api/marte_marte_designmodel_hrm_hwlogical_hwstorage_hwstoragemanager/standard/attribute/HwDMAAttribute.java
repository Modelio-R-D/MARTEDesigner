/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwArbiterAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwDMA_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("276529c2-25d7-4c3b-a251-3b2a2785808c")
public class HwDMAAttribute extends HwArbiterAttribute {
    @objid ("32018ba7-baa5-4bd6-ad03-0924ff6a3b75")
    public static final String STEREOTYPE_NAME = "HwDMA_Attribute";

    @objid ("9fc2aa9f-e3e5-48f4-abcb-ab5286515d16")
    public static final String HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE = "HwDMA_Attribute_drivenBy";

    @objid ("16507650-cc19-4389-81f6-9a64dc1c0a49")
    public static final String HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "HwDMA_Attribute_elementSize";

    @objid ("793b62f9-355f-490a-b97d-92d34cc4b976")
    public static final String HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Attribute_managedMemories";

    @objid ("090f67b1-bda3-4458-a47c-9f46b101c65a")
    public static final String HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE = "HwDMA_Attribute_nbChannels";

    @objid ("e429535d-1216-49d2-89c9-4a8b6f7577a8")
    public static final String HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE = "HwDMA_Attribute_transferWidth";

    /**
     * Tells whether a {@link HwDMAAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDMA_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0c26f5f9-33fb-4a68-b95e-7cc70ae45b8e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDMA_Attribute >> then instantiate a {@link HwDMAAttribute} proxy.
     * 
     * @return a {@link HwDMAAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b158e087-692f-4ad8-901a-e3377bde78d9")
    public static HwDMAAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAAttribute.STEREOTYPE_NAME);
        return HwDMAAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAAttribute} proxy from a {@link Attribute} stereotyped << HwDMA_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDMAAttribute} proxy or <i>null</i>.
     */
    @objid ("6c3646b5-6334-4e8d-9268-8146f9c99663")
    public static HwDMAAttribute instantiate(final Attribute obj) {
        return HwDMAAttribute.canInstantiate(obj) ? new HwDMAAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAAttribute} proxy from a {@link Attribute} stereotyped << HwDMA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwDMAAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6eed122e-7570-419a-ac8e-99b2fdd91e3e")
    public static HwDMAAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDMAAttribute.canInstantiate(obj))
        	return new HwDMAAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDMAAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7357121f-d52f-4314-9f1f-0770ab437d71")
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
        HwDMAAttribute other = (HwDMAAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("95b188e7-2baa-4064-bdaa-8861e1e3f38d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Attribute_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a55b811b-5d91-485a-acf9-f1badc134c01")
    public List<String> getHwDMA_Attribute_drivenBy() {
        return this.elt.getTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c12ba22-ea29-4fb7-b257-87d2738c9d8f")
    public String getHwDMA_Attribute_elementSize() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Attribute_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("11925ed6-7db1-4f35-bbde-8d0a9c859838")
    public List<String> getHwDMA_Attribute_managedMemories() {
        return this.elt.getTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14bfb552-d653-496c-af8c-32e146a16ae6")
    public String getHwDMA_Attribute_nbChannels() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Attribute_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8062b4d6-467d-4b93-b5a1-8a9f58c6e92c")
    public String getHwDMA_Attribute_transferWidth() {
        return this.elt.getTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("3b9eca56-ba0f-48a2-9d5e-048f47b4c7d5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Attribute_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e706a5cc-f50b-47f1-b139-2a118dc1374f")
    public void setHwDMA_Attribute_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("790f027c-f7f9-4c07-a67b-dfa49784151f")
    public void setHwDMA_Attribute_elementSize(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Attribute_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53606fcd-7c94-4ebe-845c-52825282af40")
    public void setHwDMA_Attribute_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("080e191b-91b2-49b7-8d68-7ee5b15d2305")
    public void setHwDMA_Attribute_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Attribute_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("deaf83dd-6e7e-453b-806c-e61d718b5f85")
    public void setHwDMA_Attribute_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAAttribute.MdaTypes.HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("a4f6ae40-1f1c-4cf4-a117-cfbfe5dd37f4")
    protected HwDMAAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("3a2c8d8d-8689-498e-8069-4d26d61caddd")
    public static final class MdaTypes {
        @objid ("74e71ff6-9b17-4ddd-a42f-bc8c5856ef23")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b6098a8-626e-4d37-968f-187308013291")
        public static TagType HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT;

        @objid ("58bd1f6f-1503-4897-ad63-084be2efcdb0")
        public static TagType HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("7a16f5b9-65aa-45d5-a40d-74c974ecf4a4")
        public static TagType HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT;

        @objid ("e0545001-1465-4a78-a9de-6260571efb7b")
        public static TagType HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("a5399fb3-5bd4-4e8f-9b77-3d0c967cec97")
        public static TagType HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("6d8a0f0e-2644-40aa-8b09-1a65546bbf35")
        private static Stereotype MDAASSOCDEP;

        @objid ("d81eb26c-6d5a-48c6-976b-bf34b37eed60")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6762b889-5088-4d32-b4aa-d3151cad2f2b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01783c9a-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d013f-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d0146-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017d014d-0ccf-11df-8525-001302895b2b");
            HWDMA_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "723b9290-162f-11df-b9be-0014222a9f79");
            HWDMA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d508cb6-92a3-11e0-a69d-0027103f347c");
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
