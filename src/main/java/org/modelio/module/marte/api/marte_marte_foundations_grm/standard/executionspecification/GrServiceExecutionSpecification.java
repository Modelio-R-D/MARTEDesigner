/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("ea6eacf5-b0c5-4a90-a18b-559e88428362")
    public static final String STEREOTYPE_NAME = "GrService_ExecutionSpecification";

    @objid ("4fe7dcc5-652c-478c-912b-58bf290840fc")
    public static final String GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE = "GrService_ExecutionSpecification_owner";

    /**
     * The underlying {@link ExecutionSpecification} represented by this proxy, never null.
     */
    @objid ("ac16499f-e39f-4760-9590-1fd02857f7f7")
    protected final ExecutionSpecification elt;

    /**
     * Tells whether a {@link GrServiceExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2fabada8-d7cb-44c2-a57f-b17f48a9db63")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >> then instantiate a {@link GrServiceExecutionSpecification} proxy.
     * 
     * @return a {@link GrServiceExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("08cff4ee-41b2-43d4-9f0b-cfca3654615e")
    public static GrServiceExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceExecutionSpecification.STEREOTYPE_NAME);
        return GrServiceExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << GrService_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link GrServiceExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("a84a604f-e725-41e3-8e22-d84f241ca933")
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
    @objid ("89651558-fa7e-4135-b073-26735e911ddc")
    public static GrServiceExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (GrServiceExecutionSpecification.canInstantiate(obj))
        	return new GrServiceExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("GrServiceExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1225332b-c3d4-494f-98a5-6a5cebaa5731")
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
    @objid ("98442c7f-2d22-43b4-9b08-fbb083d4e2d5")
    public ExecutionSpecification getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_ExecutionSpecification_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9bd12db-deca-4633-b29f-2d78bb3ac3eb")
    public String getGrService_ExecutionSpecification_owner() {
        return this.elt.getTagValue(GrServiceExecutionSpecification.MdaTypes.GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT);
    }

    @objid ("c54e4cd4-ec34-4c9f-8f4e-9ef6c986157d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_ExecutionSpecification_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbbf1def-faa2-4f3a-80d2-ebd6b927cebe")
    public void setGrService_ExecutionSpecification_owner(final String value) {
        this.elt.putTagValue(GrServiceExecutionSpecification.MdaTypes.GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("070844dc-dae2-4e19-a690-3ccb0da25340")
    protected GrServiceExecutionSpecification(final ExecutionSpecification elt) {
        this.elt = elt;
    }

    @objid ("fc4a11a0-20d9-4e94-a402-7be31615a09d")
    public static final class MdaTypes {
        @objid ("292849f0-a1f5-4855-a8bd-09b28ad3bde9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("607185f2-a70c-45cc-a33c-5f378ca535be")
        public static TagType GRSERVICE_EXECUTIONSPECIFICATION_OWNER_TAGTYPE_ELT;

        @objid ("31ded3cb-f3e4-4ded-b231-bcd34d516c16")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f39e14f-bebe-4ac2-80fd-a680e04f90ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4fc63d5a-5877-4462-a71a-b8c977467672")
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
