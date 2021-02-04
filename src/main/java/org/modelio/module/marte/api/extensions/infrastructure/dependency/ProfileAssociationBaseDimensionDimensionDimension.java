/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_baseDimension_Dimension_Dimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("854c55dc-94ec-4478-abf9-8976b7a965ca")
public class ProfileAssociationBaseDimensionDimensionDimension {
    @objid ("d3e03cf7-4b8d-498b-b315-855567cfedba")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_baseDimension_Dimension_Dimension";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c4459db5-b316-4b5f-a1f0-3bfbf5256250")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBaseDimensionDimensionDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("10ad91b7-635a-4f58-8db3-070e72fc8cfe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseDimensionDimensionDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >> then instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy.
     * 
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy on the created {@link Dependency}.
     */
    @objid ("35b74940-f04b-4351-800f-642ec7ae959d")
    public static ProfileAssociationBaseDimensionDimensionDimension create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseDimensionDimensionDimension.STEREOTYPE_NAME);
        return ProfileAssociationBaseDimensionDimensionDimension.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy or <i>null</i>.
     */
    @objid ("89d73304-171e-4b16-991f-446f325c58ad")
    public static ProfileAssociationBaseDimensionDimensionDimension instantiate(final Dependency obj) {
        return ProfileAssociationBaseDimensionDimensionDimension.canInstantiate(obj) ? new ProfileAssociationBaseDimensionDimensionDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseDimension_Dimension_Dimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBaseDimensionDimensionDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58fd4223-9c81-4b23-b6e0-c177a4f3f681")
    public static ProfileAssociationBaseDimensionDimensionDimension safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBaseDimensionDimensionDimension.canInstantiate(obj))
        	return new ProfileAssociationBaseDimensionDimensionDimension(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBaseDimensionDimensionDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7ad74d1d-ffa4-464c-a799-7332aa9e603f")
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
        ProfileAssociationBaseDimensionDimensionDimension other = (ProfileAssociationBaseDimensionDimensionDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d07f65ce-44e3-4ce3-a2cf-6b73157bc613")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1dfa67bb-96d2-4d7d-bd09-dd6fce3c3c25")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5a56a0bc-49f3-4178-ab3c-2a371a674477")
    protected ProfileAssociationBaseDimensionDimensionDimension(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5b77ffb6-7658-4f7d-b221-a8f2a8e761be")
    public static final class MdaTypes {
        @objid ("328a0bf3-56ae-4d6d-b271-ca0109e3950b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb892a7d-4f01-4190-8455-c808ba0fd9f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("a811d9d1-d42c-43c8-9c1c-c0b754a70630")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a559cb16-bc0d-4c18-825b-5dc44580e399")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "06cb7c10-7e04-11df-9e39-0014222a9f79");
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
