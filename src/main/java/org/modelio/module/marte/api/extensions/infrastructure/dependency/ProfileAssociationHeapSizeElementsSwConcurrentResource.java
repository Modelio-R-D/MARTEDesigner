/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_heapSizeElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1214d579-48a9-4775-afce-931ef1b99983")
public class ProfileAssociationHeapSizeElementsSwConcurrentResource {
    @objid ("8650b91f-49b7-4298-bb2d-bcc2c032e38e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_heapSizeElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6e7807b2-caed-4a2d-a22b-766185b8d932")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_heapSizeElements_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("081b239b-99fe-4416-8f6e-23852081c158")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHeapSizeElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_heapSizeElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("c904a48d-7bf9-4feb-965b-b8f9709830e1")
    public static ProfileAssociationHeapSizeElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHeapSizeElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationHeapSizeElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_heapSizeElements_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("87cd8749-8b0e-4d11-b132-3dc0244baf5f")
    public static ProfileAssociationHeapSizeElementsSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationHeapSizeElementsSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationHeapSizeElementsSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_heapSizeElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cda36702-290b-4d82-ad25-358c232be05f")
    public static ProfileAssociationHeapSizeElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationHeapSizeElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationHeapSizeElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationHeapSizeElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5eb1eb5d-951f-4e5d-934a-72734dad3dc1")
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
        ProfileAssociationHeapSizeElementsSwConcurrentResource other = (ProfileAssociationHeapSizeElementsSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ee78e931-caba-45f6-9cc7-0584822d5a95")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("03687bc4-5b23-4415-a5b1-5a785236e647")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2dbfc722-b173-4638-815e-a793433850b2")
    protected ProfileAssociationHeapSizeElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("814d8f56-e7e5-44cd-aefd-63a0abfdeabc")
    public static final class MdaTypes {
        @objid ("24af42dd-2cf3-4317-bd67-f5d0c231f11e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e61c44b2-df3a-4266-bf91-b8335c4fd7d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3863abfd-531f-405d-b6d6-c707a6628ce9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0537d18-117f-4f6f-bdba-cb7c3904190a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "511c8c93-9756-11e0-94fb-0027103f347c");
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
