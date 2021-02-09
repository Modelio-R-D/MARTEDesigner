/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class AllocatedModelElement {
    public static final String STEREOTYPE_NAME = "Allocated_ModelElement";

    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE = "Allocated_ModelElement_allocatedFrom";

    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE = "Allocated_ModelElement_allocatedTo";

    public static final String ALLOCATED_MODELELEMENT_KIND_TAGTYPE = "Allocated_ModelElement_kind";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link AllocatedModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Allocated_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AllocatedModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Allocated_ModelElement >> then instantiate a {@link AllocatedModelElement} proxy.
     * 
     * @return a {@link AllocatedModelElement} proxy on the created {@link ModelElement}.
     */
    public static AllocatedModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AllocatedModelElement.STEREOTYPE_NAME);
        return AllocatedModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link AllocatedModelElement} proxy from a {@link ModelElement} stereotyped << Allocated_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link AllocatedModelElement} proxy or <i>null</i>.
     */
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
    public static AllocatedModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (AllocatedModelElement.canInstantiate(obj))
        	return new AllocatedModelElement(obj);
        else
        	throw new IllegalArgumentException("AllocatedModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public List<String> getAllocated_ModelElement_allocatedFrom() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAllocated_ModelElement_allocatedTo() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getAllocated_ModelElement_kind() {
        return this.elt.getTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedFrom'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAllocated_ModelElement_allocatedFrom(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAllocated_ModelElement_allocatedTo(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAllocated_ModelElement_kind(final String value) {
        this.elt.putTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT, value);
    }

    protected AllocatedModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT;

        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT;

        public static TagType ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
