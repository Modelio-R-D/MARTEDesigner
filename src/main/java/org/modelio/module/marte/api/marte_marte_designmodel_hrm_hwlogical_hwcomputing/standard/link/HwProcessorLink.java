/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwProcessor_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3be649ca-1fe0-42a3-ac73-d836ec33c75f")
public class HwProcessorLink extends HwComputingResourceLink {
    @objid ("14243575-1cf0-42e4-8515-3215ca7ddee8")
    public static final String STEREOTYPE_NAME = "HwProcessor_Link";

    @objid ("bb3688a4-f624-45f6-b722-1a053d1f3436")
    public static final String HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE = "HwProcessor_Link_architecture";

    @objid ("e909ab99-4c53-4dae-89b1-64edc649f903")
    public static final String HWPROCESSOR_LINK_CACHES_TAGTYPE = "HwProcessor_Link_caches";

    @objid ("c9d03571-91c6-434f-b517-e8120c57ee34")
    public static final String HWPROCESSOR_LINK_IPC_TAGTYPE = "HwProcessor_Link_ipc";

    @objid ("245f1005-2005-4800-9763-db7471d4ea64")
    public static final String HWPROCESSOR_LINK_MIPS_TAGTYPE = "HwProcessor_Link_mips";

    @objid ("ac7dc4ac-deef-472d-8d08-6de144e19080")
    public static final String HWPROCESSOR_LINK_NBALUS_TAGTYPE = "HwProcessor_Link_nbALUs";

    @objid ("3cebeb65-6c37-4770-a39c-8849f73f880d")
    public static final String HWPROCESSOR_LINK_NBCORES_TAGTYPE = "HwProcessor_Link_nbCores";

    @objid ("da5f04df-fb08-4ecd-9a43-f3d115465216")
    public static final String HWPROCESSOR_LINK_NBFPUS_TAGTYPE = "HwProcessor_Link_nbFPUs";

    @objid ("5fbbbd1f-0c6e-4079-b17d-1c14284d288a")
    public static final String HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE = "HwProcessor_Link_nbPipelines";

    @objid ("788c2c6d-1525-4667-9a8e-a75252f9acec")
    public static final String HWPROCESSOR_LINK_NBSTAGES_TAGTYPE = "HwProcessor_Link_nbStages";

    @objid ("64766218-fc71-4896-a6cd-21da798f132f")
    public static final String HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE = "HwProcessor_Link_ownedISAs";

    @objid ("78f3c332-4ed7-4f34-ab95-ddc66b86f222")
    public static final String HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE = "HwProcessor_Link_ownedMMUs";

    @objid ("d813f92d-c17e-4d71-8c08-6b5a2d5f9d7c")
    public static final String HWPROCESSOR_LINK_PREDICTORS_TAGTYPE = "HwProcessor_Link_predictors";

    /**
     * Tells whether a {@link HwProcessorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwProcessor_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4331b289-190e-4996-93d6-67597d54c51a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwProcessor_Link >> then instantiate a {@link HwProcessorLink} proxy.
     * 
     * @return a {@link HwProcessorLink} proxy on the created {@link Link}.
     */
    @objid ("521593e0-5a84-4753-9b22-38b7ee7d85ed")
    public static HwProcessorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorLink.STEREOTYPE_NAME);
        return HwProcessorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorLink} proxy from a {@link Link} stereotyped << HwProcessor_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwProcessorLink} proxy or <i>null</i>.
     */
    @objid ("84de649f-315c-4cb9-8471-df3781f05b1d")
    public static HwProcessorLink instantiate(final Link obj) {
        return HwProcessorLink.canInstantiate(obj) ? new HwProcessorLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorLink} proxy from a {@link Link} stereotyped << HwProcessor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwProcessorLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9ed0c38-7dc3-42ca-8c06-15fa91d96587")
    public static HwProcessorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwProcessorLink.canInstantiate(obj))
        	return new HwProcessorLink(obj);
        else
        	throw new IllegalArgumentException("HwProcessorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aecb7839-fb72-4920-ae4b-b0f2510d3b24")
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
        HwProcessorLink other = (HwProcessorLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("d32e31c1-513a-4d87-9458-7f0be5843229")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Link_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d784d36-2b51-480d-bf46-30bace6fce9f")
    public String getHwProcessor_Link_architecture() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("88750128-ac6c-49c4-a6a1-c340cdb491ee")
    public List<String> getHwProcessor_Link_caches() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e86f48da-04a0-4ca7-9c89-c8f6907d6d42")
    public String getHwProcessor_Link_ipc() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c8c29f7-efbd-4cbe-9e56-6184070cc792")
    public String getHwProcessor_Link_mips() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7ba70a7-1792-4d05-9efb-2b538ff755cf")
    public String getHwProcessor_Link_nbALUs() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8cae559e-5f0e-451f-a9b1-48f2654a08dc")
    public String getHwProcessor_Link_nbCores() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b22377f-341f-4ebb-85fa-e0fc1b06589c")
    public String getHwProcessor_Link_nbFPUs() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71e1a35a-7b61-47e1-a59a-b035f8a5d7fd")
    public String getHwProcessor_Link_nbPipelines() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Link_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("364965df-e26c-4db7-82d5-68884fb67cce")
    public String getHwProcessor_Link_nbStages() {
        return this.elt.getTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("36c34cfc-1d08-44c8-beef-7a8bdaa70b5c")
    public List<String> getHwProcessor_Link_ownedISAs() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ba57c36a-87db-49d5-8e56-58f6471ea0b2")
    public List<String> getHwProcessor_Link_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Link_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("830861e8-c449-4041-be1c-44d1e3747131")
    public List<String> getHwProcessor_Link_predictors() {
        return this.elt.getTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("84fb33f9-81aa-437e-bd2a-304b8714c765")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Link_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecde1e98-be00-425d-b721-8389cc268910")
    public void setHwProcessor_Link_architecture(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c07c8e49-e44c-4060-8741-7b30f977d119")
    public void setHwProcessor_Link_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Link_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63b3a487-fc03-4782-9315-c8cd4dee3687")
    public void setHwProcessor_Link_ipc(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba8a3273-9f81-40ac-bacc-18f6302785dd")
    public void setHwProcessor_Link_mips(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb98852e-c6a8-4fb7-95d1-1364fe55ba34")
    public void setHwProcessor_Link_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7c8c04b-6ca6-4a5c-b45d-36b8d1dbe8d1")
    public void setHwProcessor_Link_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c8708ef-b059-424b-8f48-5bc282def33e")
    public void setHwProcessor_Link_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aaf736c2-edb9-434c-9b88-fe5a81537757")
    public void setHwProcessor_Link_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Link_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19fa1670-8060-4f54-92cc-d99ce15daeab")
    public void setHwProcessor_Link_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6560e94a-d5ff-4532-b416-a8fe599e27f6")
    public void setHwProcessor_Link_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be3c42d2-df82-435f-911c-68e6e8eea1e2")
    public void setHwProcessor_Link_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Link_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e129974b-82a6-49f1-8739-c9d0c5948d78")
    public void setHwProcessor_Link_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorLink.MdaTypes.HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("4a2b10f3-529e-4af2-b17d-2cff56564958")
    protected HwProcessorLink(final Link elt) {
        super(elt);
    }

    @objid ("2451bcfe-718d-492e-bf4a-d7533f2541b2")
    public static final class MdaTypes {
        @objid ("d4f229ce-7afe-482a-bf09-53577468ad95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8ec3cc4e-f4c1-4a8c-970d-081701c6dee7")
        public static TagType HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("fbf0f9e6-2fb8-4a91-b92a-c7a410d6afa7")
        public static TagType HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT;

        @objid ("c97c1966-0a2f-4a77-887e-dd3796034ce6")
        public static TagType HWPROCESSOR_LINK_IPC_TAGTYPE_ELT;

        @objid ("040b885d-bb2c-4062-b64a-a74a6d29d3ad")
        public static TagType HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT;

        @objid ("d42468c6-5c1a-40c8-bb7e-ae30a8cee164")
        public static TagType HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT;

        @objid ("6e39fb11-15ff-4efe-ba8d-f234c1e52668")
        public static TagType HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT;

        @objid ("09fba45e-8e8e-43fa-b9fa-ff69724669b9")
        public static TagType HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT;

        @objid ("53c7fddf-bcc4-4bdd-bcb1-a1a60e0e87eb")
        public static TagType HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT;

        @objid ("f7188a7a-a4ed-4d9a-ab48-23162d391754")
        public static TagType HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT;

        @objid ("285bff46-7690-4b43-96b9-c8e80694d899")
        public static TagType HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT;

        @objid ("319729a3-7423-450d-a135-bb883e8415c7")
        public static TagType HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT;

        @objid ("967717ef-c649-4a4a-af90-2beafdd6bde3")
        public static TagType HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("f5f66f38-90b3-497a-b968-f860ec5c0076")
        private static Stereotype MDAASSOCDEP;

        @objid ("0185c836-752c-4e5f-86f0-4c3db3c07ceb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e93ab953-a4d9-42a2-8267-b1cd7d5e5d6c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37e-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae385-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38c-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae393-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39a-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae3a1-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45ca-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d1-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d8-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45df-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e6-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45ed-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_LINK_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa81d-0ccf-11df-8525-001302895b2b");
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
