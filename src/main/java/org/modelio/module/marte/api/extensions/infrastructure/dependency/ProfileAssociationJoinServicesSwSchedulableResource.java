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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_joinServices_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("51ae94e5-97cb-45c8-b9e5-690143ec6982")
public class ProfileAssociationJoinServicesSwSchedulableResource {
    @objid ("05d9a382-f49a-4976-96d2-2f85fe6f1d9e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_joinServices_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("26fba2bb-c97e-43fd-9651-fa3a90e1c206")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationJoinServicesSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_joinServices_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ca970681-ae7d-49f5-a3ac-6618a028a5ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationJoinServicesSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_joinServices_SwSchedulableResource >> then instantiate a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("cc955354-8e02-411b-a121-bd8ef8273a5a")
    public static ProfileAssociationJoinServicesSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationJoinServicesSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationJoinServicesSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_joinServices_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("d4ec2560-65f0-4b62-96d8-d8b313c47568")
    public static ProfileAssociationJoinServicesSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationJoinServicesSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationJoinServicesSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_joinServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationJoinServicesSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("362c3791-c7e0-4aa8-9d36-9737595e2993")
    public static ProfileAssociationJoinServicesSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationJoinServicesSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationJoinServicesSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationJoinServicesSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7482a0eb-c705-4629-b50f-967c87d8f105")
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
        ProfileAssociationJoinServicesSwSchedulableResource other = (ProfileAssociationJoinServicesSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("974f6688-f21c-4e26-9fe4-7ba7311dfc59")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d5b336c6-1713-4ac9-8577-fdddb584ad46")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c116d519-9251-41d2-b837-16f3aadb6b11")
    protected ProfileAssociationJoinServicesSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("dc35870f-b3db-4bd8-bfe2-96ea9837f95f")
    public static final class MdaTypes {
        @objid ("f485a85d-83ac-480f-89d2-c0c6e01a695c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd92ec8a-c292-419e-a03c-104ce73ba2c7")
        private static Stereotype MDAASSOCDEP;

        @objid ("61af7794-823d-42d1-8e11-7aa749b63e2b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4de3c53c-41a3-4a56-b1db-eb901c702ef8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "28c49b40-9758-11e0-94fb-0027103f347c");
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
