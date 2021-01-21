/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.modelelement;

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
 * Proxy class to handle a {@link ModelElement} with << Allocated_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("100f09fb-820d-4fbd-aef5-48630e3c7b9f")
public class AllocatedModelElement {
    @objid ("6af79b22-5778-48f1-8c27-65b527dc158a")
    public static final String STEREOTYPE_NAME = "Allocated_ModelElement";

    @objid ("02611168-3714-418c-b50e-8cb63ae40aac")
    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE = "Allocated_ModelElement_allocatedFrom";

    @objid ("1e84bfa8-348a-4568-85b0-87a82cb2ed49")
    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE = "Allocated_ModelElement_allocatedTo";

    @objid ("5ee575e7-a900-42bb-a942-5f7327f8d261")
    public static final String ALLOCATED_MODELELEMENT_KIND_TAGTYPE = "Allocated_ModelElement_kind";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c3c8fbc6-9f59-4d56-a4d7-334ed0ea7f67")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link AllocatedModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Allocated_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4022f216-f318-4eba-ad42-4357a8ff27e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AllocatedModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Allocated_ModelElement >> then instantiate a {@link AllocatedModelElement} proxy.
     * 
     * @return a {@link AllocatedModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("8551ddca-a661-48c4-9c71-8062a26d16eb")
    public static AllocatedModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AllocatedModelElement.STEREOTYPE_NAME);
        return AllocatedModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link AllocatedModelElement} proxy from a {@link ModelElement} stereotyped << Allocated_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link AllocatedModelElement} proxy or <i>null</i>.
     */
    @objid ("d85106ee-0964-4bde-b040-7efa70783988")
    public static AllocatedModelElement instantiate(final ModelElement obj) {
        return AllocatedModelElement.canInstantiate(obj) ? new AllocatedModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AllocatedModelElement} proxy from a {@link ModelElement} stereotyped << Allocated_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link AllocatedModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ca0fa03e-e49d-4082-ab0b-6b26864b86b7")
    public static AllocatedModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (AllocatedModelElement.canInstantiate(obj))
        	return new AllocatedModelElement(obj);
        else
        	throw new IllegalArgumentException("AllocatedModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67e29059-ae9e-43c7-a884-c3ca16a8b514")
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
        AllocatedModelElement other = (AllocatedModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Allocated_ModelElement_allocatedFrom'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0c6299fb-af5b-47a9-9b96-49d4ff1d5f31")
    public List<String> getAllocated_ModelElement_allocatedFrom() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a160072c-dd44-4bad-86af-bf60a3c54932")
    public List<String> getAllocated_ModelElement_allocatedTo() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df1af8de-0913-4ed1-8f89-89324cc2c879")
    public String getAllocated_ModelElement_kind() {
        return this.elt.getTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("14394615-13bf-4e94-9c31-0d1be0fe379d")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("f7aec979-ce51-41ea-96e9-30bb1da65f1b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedFrom'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("538fe179-3b57-42ef-bd43-6494e0425ced")
    public void setAllocated_ModelElement_allocatedFrom(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47f00fb7-b141-4948-bd8f-a42cd5eaf956")
    public void setAllocated_ModelElement_allocatedTo(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("808219e7-d0da-4bcc-8b6a-d0f1da11c647")
    public void setAllocated_ModelElement_kind(final String value) {
        this.elt.putTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT, value);
    }

    @objid ("3d7674d2-033d-4843-abc0-d703a0ffc054")
    protected AllocatedModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("bd4f888d-14a3-4f19-8fcd-7716fb8f8b48")
    public static final class MdaTypes {
        @objid ("9b23e369-1b57-4819-9742-bcacbbded0a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("942afb22-2067-4df1-81bb-ebea7537f3f6")
        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT;

        @objid ("46f474d1-a701-4513-a09e-2554f6636357")
        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT;

        @objid ("0602ef33-48e4-48ae-b79c-81d8314305dc")
        public static TagType ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT;

        @objid ("84cfb030-3032-4782-8c12-4f9b7c477a0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("0afe0ab7-3825-4e28-86d7-08b91357ecd8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dff340fd-469a-4b53-854c-91f3c70a59d5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ad976a-0ccf-11df-8525-001302895b2b");
            ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00aff9b0-0ccf-11df-8525-001302895b2b");
            ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00aff9b1-0ccf-11df-8525-001302895b2b");
            ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00aff9b2-0ccf-11df-8525-001302895b2b");
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
