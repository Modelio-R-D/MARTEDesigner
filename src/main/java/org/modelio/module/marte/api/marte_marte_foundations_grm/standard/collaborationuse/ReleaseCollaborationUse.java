/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse;

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
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << Release_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6f870be-d25f-4405-b9a4-d3111e0169e5")
public class ReleaseCollaborationUse extends GrServiceCollaborationUse {
    @objid ("b63a177e-231e-4383-a461-f38bbf214b3d")
    public static final String STEREOTYPE_NAME = "Release_CollaborationUse";

    /**
     * Tells whether a {@link ReleaseCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << Release_CollaborationUse >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("43f31957-08f7-48cf-8a0d-805931da3eaf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << Release_CollaborationUse >> then instantiate a {@link ReleaseCollaborationUse} proxy.
     * 
     * @return a {@link ReleaseCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("45f6f91e-2503-43cd-9d4f-e55b5832f1de")
    public static ReleaseCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaborationUse.STEREOTYPE_NAME);
        return ReleaseCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Release_CollaborationUse >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link ReleaseCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("4365ace9-d903-4501-9efc-e72fb4e6bd2f")
    public static ReleaseCollaborationUse instantiate(final CollaborationUse obj) {
        return ReleaseCollaborationUse.canInstantiate(obj) ? new ReleaseCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Release_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link ReleaseCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a114a04e-083c-4338-8cb4-71f7e706348b")
    public static ReleaseCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (ReleaseCollaborationUse.canInstantiate(obj))
        	return new ReleaseCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("ReleaseCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("57e469ae-bc4b-4cbc-a14b-4cab7ad0b7a4")
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
        ReleaseCollaborationUse other = (ReleaseCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    @objid ("9e4c69cd-38e6-4ce1-a233-c4ccd80aa3c1")
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    @objid ("c2a878ef-8526-49bc-b47f-aee7bb0cd27a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c6e375a1-a3e5-4114-9045-80d44963f895")
    protected ReleaseCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    @objid ("7071420b-7ec3-4d56-9a3f-5fa6cff9f783")
    public static final class MdaTypes {
        @objid ("e1650b46-ba34-49f2-be29-32613c1e36ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f0e11579-8f60-47cf-a1b2-681d6ed87598")
        private static Stereotype MDAASSOCDEP;

        @objid ("3cd79e83-36a7-4f3f-8ba3-97bf9fdb5597")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78b5c04b-d88c-4087-844e-7ec1474149f1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4c4fe163-0f30-11df-8c52-0014222a9f79");
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
