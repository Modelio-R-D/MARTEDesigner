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
    @objid ("7040b6a4-0448-44a2-a6c5-50943051862f")
    public static final String STEREOTYPE_NAME = "Allocated_ModelElement";

    @objid ("be41f96b-bac7-4dcc-977e-31f522a109ed")
    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE = "Allocated_ModelElement_allocatedFrom";

    @objid ("e30ccafe-e339-4405-9c53-6d80de504cea")
    public static final String ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE = "Allocated_ModelElement_allocatedTo";

    @objid ("a5fda032-3330-49ee-b809-fb99507dff35")
    public static final String ALLOCATED_MODELELEMENT_KIND_TAGTYPE = "Allocated_ModelElement_kind";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("9b50bfe9-2306-4f4f-92e0-48f2b8b66333")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link AllocatedModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Allocated_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f420d553-ffcf-4a22-a356-ab1397315089")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AllocatedModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Allocated_ModelElement >> then instantiate a {@link AllocatedModelElement} proxy.
     * 
     * @return a {@link AllocatedModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("c2be88e6-adcd-4890-949d-100fd6d0ba93")
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
    @objid ("b6ce995d-1148-4af2-abd3-bde672b88ab0")
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
    @objid ("c022f896-fb68-4d6b-b9b1-f6d46b6e297b")
    public static AllocatedModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (AllocatedModelElement.canInstantiate(obj))
        	return new AllocatedModelElement(obj);
        else
        	throw new IllegalArgumentException("AllocatedModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e57b4210-cc9e-40af-a375-d9294a18dd29")
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
    @objid ("3ad5e659-0dd7-4107-a888-8b2d549e6f3a")
    public List<String> getAllocated_ModelElement_allocatedFrom() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eab14f97-fc0a-4210-9129-52f36a17e357")
    public List<String> getAllocated_ModelElement_allocatedTo() {
        return this.elt.getTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39a42dd7-d1a7-4cd7-862f-a327ebab81c0")
    public String getAllocated_ModelElement_kind() {
        return this.elt.getTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("3b20fe90-4a5a-488d-bdc0-32cfb7b171c9")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("c462bbe3-4841-4956-882a-20b94b31b525")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedFrom'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("702c4d6a-7e1f-452f-b151-623eea116e23")
    public void setAllocated_ModelElement_allocatedFrom(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Allocated_ModelElement_allocatedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06d6faf6-ae5d-4038-a957-6358099cd159")
    public void setAllocated_ModelElement_allocatedTo(final List<String> values) {
        this.elt.putTagValues(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Allocated_ModelElement_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("274d1b51-1eb2-483f-a5be-f7420f08aa9d")
    public void setAllocated_ModelElement_kind(final String value) {
        this.elt.putTagValue(AllocatedModelElement.MdaTypes.ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT, value);
    }

    @objid ("3eb4524a-00a9-49c7-8335-02b7ff3845c8")
    protected AllocatedModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("bd4f888d-14a3-4f19-8fcd-7716fb8f8b48")
    public static final class MdaTypes {
        @objid ("f0eed1a1-c1f3-430f-bd19-793a2e0f5c6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4859447c-967b-4cb3-a7e6-c4e777b82c31")
        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDTO_TAGTYPE_ELT;

        @objid ("55461a49-f510-463f-b3dd-61378cd72672")
        public static TagType ALLOCATED_MODELELEMENT_ALLOCATEDFROM_TAGTYPE_ELT;

        @objid ("091f509d-f0f6-4fca-8253-eb32c7d3f4f8")
        public static TagType ALLOCATED_MODELELEMENT_KIND_TAGTYPE_ELT;

        @objid ("77841b2e-0d9e-49a7-b924-9347a1fbeb4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("19939652-0456-42f2-aa76-af0c6412e435")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("851c1ebc-80fc-4752-9292-cddbbb8751cf")
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
