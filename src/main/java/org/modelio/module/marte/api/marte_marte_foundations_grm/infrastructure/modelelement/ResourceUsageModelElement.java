/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << ResourceUsage_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("228d691b-816c-4396-bbc7-a5061613af86")
public class ResourceUsageModelElement {
    @objid ("402b56b4-abe7-4ac9-9614-acf1e11ca0cb")
    public static final String STEREOTYPE_NAME = "ResourceUsage_ModelElement";

    @objid ("f6fc7236-1c46-4510-bdbf-b2fd99ac4aef")
    public static final String RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE = "ResourceUsage_ModelElement_allocatedMemory";

    @objid ("fa737524-baa9-4ce5-a086-c36ae93d46e6")
    public static final String RESOURCEUSAGE_MODELELEMENT_ENERGY_TAGTYPE = "ResourceUsage_ModelElement_energy";

    @objid ("662de22d-89c6-4900-8977-0b638b6cf090")
    public static final String RESOURCEUSAGE_MODELELEMENT_EXECTIME_TAGTYPE = "ResourceUsage_ModelElement_execTime";

    @objid ("d5e45035-9895-4850-a7f2-87e540f9250d")
    public static final String RESOURCEUSAGE_MODELELEMENT_MSGSIZE_TAGTYPE = "ResourceUsage_ModelElement_msgSize";

    @objid ("1de6ab89-9a39-4e2d-ba5c-f54dace6f7c5")
    public static final String RESOURCEUSAGE_MODELELEMENT_POWERPEAK_TAGTYPE = "ResourceUsage_ModelElement_powerPeak";

    @objid ("202f8ce4-8039-4326-ba48-5ed1def48942")
    public static final String RESOURCEUSAGE_MODELELEMENT_SUBUSAGE_TAGTYPE = "ResourceUsage_ModelElement_subUsage";

    @objid ("01c425e4-4253-40aa-bd48-2766fc4cd50f")
    public static final String RESOURCEUSAGE_MODELELEMENT_USEDMEMORY_TAGTYPE = "ResourceUsage_ModelElement_usedMemory";

    @objid ("65761f3f-58f3-47e7-b62d-6f90101fe5f3")
    public static final String RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES_TAGTYPE = "ResourceUsage_ModelElement_usedResources";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("be67de9c-9d6a-4e5f-90e8-13c0d17634c8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ResourceUsageModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ResourceUsage_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("77dd80c1-a803-4ab3-9f46-7e29bb843fb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceUsageModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ResourceUsage_ModelElement >> then instantiate a {@link ResourceUsageModelElement} proxy.
     * 
     * @return a {@link ResourceUsageModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("1841c180-8cda-4336-9155-a289fb53be73")
    public static ResourceUsageModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceUsageModelElement.STEREOTYPE_NAME);
        return ResourceUsageModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ResourceUsageModelElement} proxy from a {@link ModelElement} stereotyped << ResourceUsage_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ResourceUsageModelElement} proxy or <i>null</i>.
     */
    @objid ("e5513286-2158-4e8b-af6e-e1c70a90a04a")
    public static ResourceUsageModelElement instantiate(final ModelElement obj) {
        return ResourceUsageModelElement.canInstantiate(obj) ? new ResourceUsageModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceUsageModelElement} proxy from a {@link ModelElement} stereotyped << ResourceUsage_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ResourceUsageModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dcee7d40-b33f-43cb-bbe4-df6ee1f5f34a")
    public static ResourceUsageModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ResourceUsageModelElement.canInstantiate(obj))
        	return new ResourceUsageModelElement(obj);
        else
        	throw new IllegalArgumentException("ResourceUsageModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ca890f7-f3ad-40ac-abcf-bd11517c247e")
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
        ResourceUsageModelElement other = (ResourceUsageModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e3abbf5f-4dbf-4867-81fe-b5c8efeb55ba")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_allocatedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("814d8d3e-67f7-44ac-8115-e475ab913692")
    public List<String> getResourceUsage_ModelElement_allocatedMemory() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_energy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae141e42-86f6-4409-8830-23008de9b236")
    public List<String> getResourceUsage_ModelElement_energy() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_ENERGY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_execTime'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2cbc5a8c-1254-4322-bf10-3438282e714b")
    public List<String> getResourceUsage_ModelElement_execTime() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_EXECTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_msgSize'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f26a9f8-4af4-485b-b648-deb789f00a2c")
    public List<String> getResourceUsage_ModelElement_msgSize() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_powerPeak'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5019d0db-6a58-4e63-bb7a-8ec4b8b511a3")
    public List<String> getResourceUsage_ModelElement_powerPeak() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_POWERPEAK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_subUsage'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6d665096-031a-497a-9971-eee9988e5228")
    public List<String> getResourceUsage_ModelElement_subUsage() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_usedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("56511112-8e39-430f-b797-6b0450165b10")
    public List<String> getResourceUsage_ModelElement_usedMemory() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ResourceUsage_ModelElement_usedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70d2eb33-5730-46fb-84c7-fe312acfcfd6")
    public List<String> getResourceUsage_ModelElement_usedResources() {
        return this.elt.getTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT);
    }

    @objid ("b40f6b34-55ff-4da1-b6e0-c2c8d4fc0c05")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_allocatedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cabd3a5-111b-44f2-a900-82d04d125a20")
    public void setResourceUsage_ModelElement_allocatedMemory(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_energy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fa882ec-7edd-4b5f-b2ce-5ed07de889b0")
    public void setResourceUsage_ModelElement_energy(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_ENERGY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_execTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4e05c80-100c-4c55-b769-65faf53c3711")
    public void setResourceUsage_ModelElement_execTime(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_EXECTIME_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3381b55-0808-4ce7-a660-9c5fdc04db02")
    public void setResourceUsage_ModelElement_msgSize(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_MSGSIZE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_powerPeak'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24cd1fb1-1878-4718-bf15-6338db22be73")
    public void setResourceUsage_ModelElement_powerPeak(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_POWERPEAK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_subUsage'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("018b2b96-031a-4a91-8c8b-6d9e223c114a")
    public void setResourceUsage_ModelElement_subUsage(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_usedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f374af4d-45b5-4b22-9d00-ef7d861739ef")
    public void setResourceUsage_ModelElement_usedMemory(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ResourceUsage_ModelElement_usedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28fd1ac2-2198-45ea-903e-17e87bbbb361")
    public void setResourceUsage_ModelElement_usedResources(final List<String> values) {
        this.elt.putTagValues(ResourceUsageModelElement.MdaTypes.RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT, values);
    }

    @objid ("c5ed5b0d-0eff-47cf-b157-f72471e4ad69")
    protected ResourceUsageModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("25509508-0d0b-49b2-94f1-d7a683b73c53")
    public static final class MdaTypes {
        @objid ("dc8d79ed-1f76-4ea5-8ac3-47b8472ef7a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0af71f7-71cf-42e5-9ab4-a2a8b193887d")
        public static TagType RESOURCEUSAGE_MODELELEMENT_EXECTIME_TAGTYPE_ELT;

        @objid ("f7a7e926-d86b-4361-85c1-32fe6c22c336")
        public static TagType RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT;

        @objid ("e3698e98-0026-4de0-b434-75518dd93362")
        public static TagType RESOURCEUSAGE_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT;

        @objid ("542968af-8aac-4d1f-ad36-bf02b07093b0")
        public static TagType RESOURCEUSAGE_MODELELEMENT_POWERPEAK_TAGTYPE_ELT;

        @objid ("2aef908d-4735-494a-8b44-b338d9f954fd")
        public static TagType RESOURCEUSAGE_MODELELEMENT_ENERGY_TAGTYPE_ELT;

        @objid ("920f1b12-6ca3-49a2-a0ee-109a7ff24b87")
        public static TagType RESOURCEUSAGE_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT;

        @objid ("b19aaf69-a444-4afe-a595-fa3c924c3565")
        public static TagType RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT;

        @objid ("f7ef64d5-908d-4c5c-96f3-9db58f3df343")
        public static TagType RESOURCEUSAGE_MODELELEMENT_MSGSIZE_TAGTYPE_ELT;

        @objid ("716b2b0b-f140-44bb-b7f8-ac9c732ee468")
        private static Stereotype MDAASSOCDEP;

        @objid ("47d2bdad-e0e9-457c-8ba3-50d16746a89a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2be8f3c-63ea-4ff0-9b57-e08fc0123d67")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ad9760-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_EXECTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9761-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9762-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9763-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_POWERPEAK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9764-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_ENERGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9765-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9766-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9767-0ccf-11df-8525-001302895b2b");
            RESOURCEUSAGE_MODELELEMENT_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad9768-0ccf-11df-8525-001302895b2b");
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
