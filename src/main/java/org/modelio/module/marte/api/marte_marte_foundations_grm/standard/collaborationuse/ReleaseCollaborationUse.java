/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("9bd9fd08-29e0-4cbb-9c35-7601c0a01c00")
    public static final String STEREOTYPE_NAME = "Release_CollaborationUse";

    /**
     * Tells whether a {@link ReleaseCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << Release_CollaborationUse >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2088ede9-44cf-48cd-bb57-7aa3964802dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << Release_CollaborationUse >> then instantiate a {@link ReleaseCollaborationUse} proxy.
     * 
     * @return a {@link ReleaseCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("8e7a990c-e0db-44df-bccf-b71bda610459")
    public static ReleaseCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaborationUse.STEREOTYPE_NAME);
        return ReleaseCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Release_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link ReleaseCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("ad7f5e4f-1dab-4148-a582-00d2c8469c60")
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
    @objid ("2a80201e-d417-46f7-8262-df7324bcb2f7")
    public static ReleaseCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (ReleaseCollaborationUse.canInstantiate(obj))
        	return new ReleaseCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("ReleaseCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24cbedd2-03b5-4f0a-b28f-ccb6284d24ff")
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
    @objid ("7a876113-b9be-421a-ad83-5d4c139e2dd0")
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    @objid ("7f937274-6cd3-4f18-9799-facbedb48592")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f2c908aa-e453-4e10-9388-089db1d7f843")
    protected ReleaseCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    @objid ("7071420b-7ec3-4d56-9a3f-5fa6cff9f783")
    public static final class MdaTypes {
        @objid ("a905966c-4a99-4040-bb0f-f5989f8afbac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57ed222d-d0cd-4904-b1e3-dd9cfab323ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("3be1dc4d-129e-4e92-8c5d-691d17225623")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1b6561ab-b429-4fae-8048-c22e000da147")
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
