/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaExecHostAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SaExecHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0d58a6e8-d69c-464b-bd8a-c0b07abe9529")
public class SaExecHostAssociation extends GaExecHostAssociation {
    @objid ("bd2431ae-1d32-4f59-ab2e-2eb4a9c69e22")
    public static final String STEREOTYPE_NAME = "SaExecHost_Association";

    @objid ("2d1ab78e-2b6b-402f-a1d0-edbc011f6b3d")
    public static final String SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE = "SaExecHost_Association_ISRprioRange";

    @objid ("2276803a-da03-44ef-a99a-53efb8da5703")
    public static final String SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE = "SaExecHost_Association_ISRswitchT";

    @objid ("6c3b7706-9eb8-4d72-b9f2-5c31991d81f0")
    public static final String SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE = "SaExecHost_Association_isSched";

    @objid ("5a5894e4-bb1f-4ec4-be11-31f32b5d280c")
    public static final String SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE = "SaExecHost_Association_schSlack";

    @objid ("a94a70a3-1772-4b66-ba16-34ffde4ee839")
    public static final String SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Association_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaExecHost_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("06c8de6a-9317-4fda-93e4-eca378ed776a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaExecHost_Association >> then instantiate a {@link SaExecHostAssociation} proxy.
     * 
     * @return a {@link SaExecHostAssociation} proxy on the created {@link Association}.
     */
    @objid ("84118727-eac8-4779-803e-7b2a6e9271b4")
    public static SaExecHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociation.STEREOTYPE_NAME);
        return SaExecHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociation} proxy from a {@link Association} stereotyped << SaExecHost_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaExecHostAssociation} proxy or <i>null</i>.
     */
    @objid ("907170d2-2bd6-476e-95a1-dc3c0eb448ac")
    public static SaExecHostAssociation instantiate(final Association obj) {
        return SaExecHostAssociation.canInstantiate(obj) ? new SaExecHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociation} proxy from a {@link Association} stereotyped << SaExecHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SaExecHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3f08552f-97c1-4ef7-a6ae-5278d9c7d694")
    public static SaExecHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaExecHostAssociation.canInstantiate(obj))
        	return new SaExecHostAssociation(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ad56e086-e8aa-4fcc-a38e-febb42acb943")
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
        SaExecHostAssociation other = (SaExecHostAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("7cd1582a-36ca-4092-bdbc-b38263db1c24")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Association_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8207b5cf-2f04-499e-bb4c-45ab95ff19a1")
    public String getSaExecHost_Association_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfa7b0aa-5919-4b16-91a8-23fe431fa8f5")
    public String getSaExecHost_Association_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c35a0e93-19fc-4889-b6da-f99c34b113ca")
    public String getSaExecHost_Association_schSlack() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c0237cb-b833-4b11-86cb-8067872760b6")
    public String getSaExecHost_Association_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("f358a05e-88fa-4847-9f02-a7453fd25464")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e15067e0-c6e2-441f-826f-9b4eafd4b1c1")
    public boolean isSaExecHost_Association_isSched() {
        return this.elt.isTagged(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Association_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("279e5a97-319e-4b3d-b205-d85bf6f32bd1")
    public void setSaExecHost_Association_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Association_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca4a1f44-7283-4e22-b22a-94cc05e4b2b7")
    public void setSaExecHost_Association_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1d5891e-6790-4764-b383-d993eb59de24")
    public void setSaExecHost_Association_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edbde738-1589-48bd-bd6d-598ae348c5cf")
    public void setSaExecHost_Association_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Association_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd88180c-aa78-4b05-9f6d-de4b6937d080")
    public void setSaExecHost_Association_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("b0f32c24-3b00-47bc-9e79-27e399e42d30")
    protected SaExecHostAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b913b209-bb4a-4d15-9649-eb91fe85540c")
    public static final class MdaTypes {
        @objid ("77472b71-d10b-46e1-9cd0-f23e727d794c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f213fd7c-e49e-4f02-8970-176783c5c52c")
        public static TagType SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT;

        @objid ("a1591324-531e-4109-81fd-f71c0a5898aa")
        public static TagType SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT;

        @objid ("f2f48e16-0385-4e7d-a43b-685f77b575e4")
        public static TagType SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("53964606-05e6-4bcd-95af-89f446cdc051")
        public static TagType SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("a1978343-c71d-4878-b7c4-de86148e0301")
        public static TagType SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("cf9f4eca-0c36-4b84-b022-9692a3066e7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8eac85e9-e5ee-4cec-ae23-533aa2109ab6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5add50ff-008c-4931-9087-d06ce8b45f14")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f85b1781-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1782-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1783-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1784-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1785-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1786-14ad-11df-9d54-0014222a9f79");
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
