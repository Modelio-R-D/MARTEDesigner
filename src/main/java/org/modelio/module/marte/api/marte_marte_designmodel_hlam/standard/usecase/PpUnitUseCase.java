/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
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
 * Proxy class to handle a {@link UseCase} with << PpUnit_UseCase >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3dd9f622-c0b6-44c1-8c01-72be9f17fee7")
public class PpUnitUseCase {
    @objid ("2408a1e0-85e6-4b26-8b65-ad5cefa60779")
    public static final String STEREOTYPE_NAME = "PpUnit_UseCase";

    @objid ("64423421-731a-4622-8aae-cd71e69dfca9")
    public static final String PPUNIT_USECASE_CONCPOLICY_TAGTYPE = "PpUnit_UseCase_concPolicy";

    @objid ("53b97765-ce67-4b62-b8b9-a558aa7fa0ad")
    public static final String PPUNIT_USECASE_MEMORYSIZE_TAGTYPE = "PpUnit_UseCase_memorySize";

    /**
     * The underlying {@link UseCase} represented by this proxy, never null.
     */
    @objid ("b1ae8c8a-36c1-49fd-8702-cebc924a96b8")
    protected final UseCase elt;

    /**
     * Tells whether a {@link PpUnitUseCase proxy} can be instantiated from a {@link MObject} checking it is a {@link UseCase} stereotyped << PpUnit_UseCase >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d75aa2c6-afa8-412f-b84b-fc75c49a82e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UseCase) && ((UseCase) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitUseCase.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UseCase} stereotyped << PpUnit_UseCase >> then instantiate a {@link PpUnitUseCase} proxy.
     * 
     * @return a {@link PpUnitUseCase} proxy on the created {@link UseCase}.
     */
    @objid ("9045b127-6ffc-4f3f-b9ce-06be4b12efef")
    public static PpUnitUseCase create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("UseCase");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitUseCase.STEREOTYPE_NAME);
        return PpUnitUseCase.instantiate((UseCase)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitUseCase} proxy from a {@link UseCase} stereotyped << PpUnit_UseCase >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UseCase
     * @return a {@link PpUnitUseCase} proxy or <i>null</i>.
     */
    @objid ("5794d9b6-b46f-485e-8ee9-0ef02525a171")
    public static PpUnitUseCase instantiate(final UseCase obj) {
        return PpUnitUseCase.canInstantiate(obj) ? new PpUnitUseCase(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitUseCase} proxy from a {@link UseCase} stereotyped << PpUnit_UseCase >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link UseCase}
     * @return a {@link PpUnitUseCase} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f9453559-03b4-4355-827e-00d0ea09ed52")
    public static PpUnitUseCase safeInstantiate(final UseCase obj) throws IllegalArgumentException {
        if (PpUnitUseCase.canInstantiate(obj))
        	return new PpUnitUseCase(obj);
        else
        	throw new IllegalArgumentException("PpUnitUseCase: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3dfe7d5d-b4cb-4d26-bb50-c811f3c51705")
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
        PpUnitUseCase other = (PpUnitUseCase) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UseCase}. 
     * @return the UseCase represented by this proxy, never null.
     */
    @objid ("b672d588-56fc-4abe-812f-a19e2d045fc1")
    public UseCase getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_UseCase_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b1fef77-5cd6-446e-a5fb-66c0a53d5fe9")
    public String getPpUnit_UseCase_concPolicy() {
        return this.elt.getTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e843d7c-6b04-40d3-b26a-dee9c30e7098")
    public String getPpUnit_UseCase_memorySize() {
        return this.elt.getTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("ff7e9b5c-7a84-449d-bb7a-b6660ffcdf2a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_UseCase_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85adb054-4095-4733-bc59-cec021ad8a61")
    public void setPpUnit_UseCase_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b44f296-da26-4d32-8710-22be6019b896")
    public void setPpUnit_UseCase_memorySize(final String value) {
        this.elt.putTagValue(PpUnitUseCase.MdaTypes.PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("de4ea3e9-aa9d-4fd2-b223-569cf043f9d2")
    protected PpUnitUseCase(final UseCase elt) {
        this.elt = elt;
    }

    @objid ("c874935c-a7b1-4d69-9222-34ae765d53b6")
    public static final class MdaTypes {
        @objid ("c8040df0-67ba-406c-a97d-3ef87ea40754")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5a6dd9d-0700-4531-ac49-3e9381fa30c9")
        public static TagType PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT;

        @objid ("1bdb3c1d-1304-46bb-b8a5-42470b8d45fd")
        public static TagType PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("8e7bd427-2511-47f7-91ac-bba244b403d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e9364bb-3a22-4d26-8051-6af03d9504fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ca778edf-efbe-4355-86ce-736952a07d50")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d3d7b779-0ce9-11df-b742-001302895b2b");
            PPUNIT_USECASE_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d7b77a-0ce9-11df-b742-001302895b2b");
            PPUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d7b77b-0ce9-11df-b742-001302895b2b");
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
