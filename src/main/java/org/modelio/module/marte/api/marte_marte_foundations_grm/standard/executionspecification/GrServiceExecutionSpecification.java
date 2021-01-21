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
 * Proxy class to handle a {@link ExecutionSpecification} with << GrService_ExecutionSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("027ef767-53a0-43ef-9818-293e3a0359e0")
public class GrServiceExecutionSpecification {
    @objid ("8d13adbf-12ad-40e0-9540-8eea1766006f")
    public static final String STEREOTYPE_NAME = "GrService_ExecutionSpecification";

    @objid ("2c41cd3c-5846-4b2a-964e-ae40b28fc7e1")
    public static final String GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE = "GrService_ExecutionSpecification_owner";

    /**
     * The underlying {@link ExecutionSpecification} represented by this proxy, never null.
     */
    @objid ("3ec7f8de-1b71-48cd-8bfc-740da48f2450")
    protected final ExecutionSpecification elt;

    /**
     * Tells whether a {@link GrServiceExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4aa63ec3-8b96-4bd0-ab79-a7a8803fcd87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >> then instantiate a {@link GrServiceExecutionSpecification} proxy.
     * 
     * @return a {@link GrServiceExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("8a93db0d-6918-464d-b468-9dca72742b56")
    public static GrServiceExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceExecutionSpecification.STEREOTYPE_NAME);
        return GrServiceExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link GrServiceExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("6dd45d59-e8c2-49ba-8a0b-7bc324852bc6")
    public static GrServiceExecutionSpecification instantiate(final ExecutionSpecification obj) {
        return GrServiceExecutionSpecification.canInstantiate(obj) ? new GrServiceExecutionSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ExecutionSpecification}
     * @return a {@link GrServiceExecutionSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7cf7803d-daa2-46a2-8413-b20f3303a772")
    public static GrServiceExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (GrServiceExecutionSpecification.canInstantiate(obj))
        	return new GrServiceExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("GrServiceExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a3935c26-7505-4885-8e3a-3d7a4e8b8f6c")
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
        GrServiceExecutionSpecification other = (GrServiceExecutionSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ExecutionSpecification}. 
     * @return the ExecutionSpecification represented by this proxy, never null.
     */
    @objid ("de4538a1-8326-4fa9-b32a-90e9cb10e6d1")
    public ExecutionSpecification getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_ExecutionSpecification_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e010d14e-3502-4434-9cb6-402916f578d6")
    public String getGrService_ExecutionSpecification_owner() {
        return this.elt.getTagValue(GrServiceExecutionSpecification.MdaTypes.GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT);
    }

    @objid ("b95fdbb6-577d-4e30-9a26-9722f5417ab1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_ExecutionSpecification_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1888015-2472-48da-8ff9-3143ebfc5fd9")
    public void setGrService_ExecutionSpecification_owner(final String value) {
        this.elt.putTagValue(GrServiceExecutionSpecification.MdaTypes.GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("37ffc947-3004-43fe-87cc-e23664b4a01d")
    protected GrServiceExecutionSpecification(final ExecutionSpecification elt) {
        this.elt = elt;
    }

    @objid ("fc4a11a0-20d9-4e94-a402-7be31615a09d")
    public static final class MdaTypes {
        @objid ("265c5b39-8912-4bb9-aa71-c1ae59c70837")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6e60d53-c189-417e-870d-89b7017c45e3")
        public static TagType GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT;

        @objid ("e4679e17-27e8-48a3-9bdd-dfdd8328aa74")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0ae7b61-da13-43be-a1e3-2dda433d39d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cfd82645-32ed-4d9f-8762-3c2228567c74")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abd9-0ccf-11df-8525-001302895b2b");
            GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a8d2bb-0ccf-11df-8525-001302895b2b");
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
