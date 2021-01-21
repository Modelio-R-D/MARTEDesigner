/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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
 * Proxy class to handle a {@link ExecutionSpecification} with << Release_ExecutionSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ce04d1f3-f269-4184-b787-aa1a591f8907")
public class ReleaseExecutionSpecification extends GrServiceExecutionSpecification {
    @objid ("6c41ae1b-bde6-48cb-b405-32400b0d9f93")
    public static final String STEREOTYPE_NAME = "Release_ExecutionSpecification";

    /**
     * Tells whether a {@link ReleaseExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << Release_ExecutionSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e77f5e0b-4713-4d89-b264-7272b64b7f65")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << Release_ExecutionSpecification >> then instantiate a {@link ReleaseExecutionSpecification} proxy.
     * 
     * @return a {@link ReleaseExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("ccc91856-a0df-4b17-b6bd-14930843f1c6")
    public static ReleaseExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseExecutionSpecification.STEREOTYPE_NAME);
        return ReleaseExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << Release_ExecutionSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link ReleaseExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("514c1390-05ca-49bf-9337-282d28bea103")
    public static ReleaseExecutionSpecification instantiate(final ExecutionSpecification obj) {
        return ReleaseExecutionSpecification.canInstantiate(obj) ? new ReleaseExecutionSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << Release_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ExecutionSpecification}
     * @return a {@link ReleaseExecutionSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("612198c3-8fc7-45bd-a672-9e8db0932359")
    public static ReleaseExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (ReleaseExecutionSpecification.canInstantiate(obj))
        	return new ReleaseExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("ReleaseExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d010b05-37e7-4ed1-918c-a3e6357d226d")
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
        ReleaseExecutionSpecification other = (ReleaseExecutionSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ExecutionSpecification}. 
     * @return the ExecutionSpecification represented by this proxy, never null.
     */
    @objid ("2b0fe59f-edfb-483a-bf34-3adfd233e8c4")
    @Override
    public ExecutionSpecification getElement() {
        return (ExecutionSpecification)super.getElement();
    }

    @objid ("43295afd-c140-4caf-beac-bf8edac4eaab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8eb0c5a3-8d7c-45cd-8a85-ed33411bb576")
    protected ReleaseExecutionSpecification(final ExecutionSpecification elt) {
        super(elt);
    }

    @objid ("cf283585-20a0-40d7-b05f-b822d6ad6177")
    public static final class MdaTypes {
        @objid ("7c28b1d3-1424-4164-81ed-b26bae594174")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("76f77f28-bf2c-454f-9b34-d41188eb9c7c")
        private static Stereotype MDAASSOCDEP;

        @objid ("359f841a-0ac5-466c-956e-5e383504cb7e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bc788bd9-cb53-4b98-9058-93c8494ada29")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab350c-0ccf-11df-8525-001302895b2b");
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
